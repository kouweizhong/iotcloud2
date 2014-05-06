package cgl.iotcloud.transport.rabbitmq;

import cgl.iotcloud.core.transport.MessageConverter;
import com.rabbitmq.client.Address;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

public class RabbitMQSender {
    private static Logger LOG = LoggerFactory.getLogger(RabbitMQSender.class);

    private Channel channel;

    private Connection conn;

    private MessageConverter converter;

    private BlockingQueue outQueue;

    private String exchangeName;

    private String routingKey;

    private String queueName;

    private Address []addresses;

    private String url;

    private ExecutorService executorService;

    public RabbitMQSender(MessageConverter converter,
                          BlockingQueue outQueue,
                          String exchangeName,
                          String routingKey,
                          String queueName,
                          ExecutorService executorService,
                          Address []addresses,
                          String url) {
        this.executorService = executorService;
        this.converter = converter;
        this.outQueue = outQueue;
        this.exchangeName = exchangeName;
        this.routingKey = routingKey;
        this.addresses = addresses;
        this.url = url;
        this.queueName = queueName;
    }

    public void start() {
        ConnectionFactory factory = new ConnectionFactory();
        try {
            if (addresses == null) {
                factory.setUri(url);
                if (executorService != null) {
                    conn = factory.newConnection(executorService);
                } else {
                    conn = factory.newConnection();
                }
            } else {
                if (executorService != null) {
                    conn = factory.newConnection(executorService, addresses);
                } else {
                    conn = factory.newConnection(addresses);
                }
            }

            channel = conn.createChannel();
            channel.exchangeDeclare(exchangeName, "direct", true);
            channel.queueDeclare(this.queueName, true, false, false, null).getQueue();
            channel.queueBind(queueName, exchangeName, routingKey);

            Thread t = new Thread(new Worker());
            t.start();
        } catch (IOException e) {
            String msg = "Error creating the RabbitMQ channel";
            LOG.error(msg, e);
            throw new RuntimeException(msg, e);
        } catch (Exception e) {
            String msg = "Error creating the RabbitMQ channel";
            LOG.error(msg, e);
            throw new RuntimeException(msg, e);
        }
    }

    public void stop() {
        try {
            channel.close();
            conn.close();
        } catch (IOException e) {
            LOG.error("Error closing the rabbit MQ connection", e);
        }
    }

    private class Worker implements Runnable {
        @Override
        public void run() {
            boolean run = true;
            int errorCount = 0;
            while (run) {
                try {
                    try {
                        Object input = outQueue.take();
                        Object converted = converter.convert(input, null);
                        if (converted instanceof byte []) {
                            channel.basicPublish(exchangeName, routingKey, null, (byte[]) converted);
                        } else if (converted instanceof RabbitMQMessage) {
                            channel.basicPublish(exchangeName, routingKey,
                                    ((RabbitMQMessage) converted).getBasicProperties(), ((RabbitMQMessage) converted).getBody());
                        } else {
                            throw new RuntimeException("Expepected byte array after conversion");
                        }
                    } catch (InterruptedException e) {
                        LOG.error("Exception occurred in the worker listening for consumer changes", e);
                    }
                } catch (Throwable t) {
                    errorCount++;
                    if (errorCount <= 3) {
                        LOG.error("Error occurred " + errorCount + " times.. trying to continue the worker");
                    } else {
                        LOG.error("Error occurred " + errorCount + " times.. terminating the worker");
                        run = false;
                    }
                }
            }
            String message = "Unexpected notification type";
            LOG.error(message);
            throw new RuntimeException(message);
        }
    }
}
