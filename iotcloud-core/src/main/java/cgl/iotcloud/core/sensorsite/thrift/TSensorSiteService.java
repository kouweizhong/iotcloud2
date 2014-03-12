/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package cgl.iotcloud.core.sensorsite.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all") public class TSensorSiteService {

  public interface Iface {

    public cgl.iotcloud.core.master.thrift.THeartBeatResponse hearbeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void hearbeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.hearbeat_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatResponse hearbeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat) throws org.apache.thrift.TException
    {
      send_hearbeat(heartBeat);
      return recv_hearbeat();
    }

    public void send_hearbeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat) throws org.apache.thrift.TException
    {
      hearbeat_args args = new hearbeat_args();
      args.setHeartBeat(heartBeat);
      sendBase("hearbeat", args);
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatResponse recv_hearbeat() throws org.apache.thrift.TException
    {
      hearbeat_result result = new hearbeat_result();
      receiveBase(result, "hearbeat");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "hearbeat failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void hearbeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat, org.apache.thrift.async.AsyncMethodCallback<hearbeat_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      hearbeat_call method_call = new hearbeat_call(heartBeat, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class hearbeat_call extends org.apache.thrift.async.TAsyncMethodCall {
      private cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat;
      public hearbeat_call(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat, org.apache.thrift.async.AsyncMethodCallback<hearbeat_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.heartBeat = heartBeat;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("hearbeat", org.apache.thrift.protocol.TMessageType.CALL, 0));
        hearbeat_args args = new hearbeat_args();
        args.setHeartBeat(heartBeat);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public cgl.iotcloud.core.master.thrift.THeartBeatResponse getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_hearbeat();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("hearbeat", new hearbeat());
      return processMap;
    }

    public static class hearbeat<I extends Iface> extends org.apache.thrift.ProcessFunction<I, hearbeat_args> {
      public hearbeat() {
        super("hearbeat");
      }

      public hearbeat_args getEmptyArgsInstance() {
        return new hearbeat_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public hearbeat_result getResult(I iface, hearbeat_args args) throws org.apache.thrift.TException {
        hearbeat_result result = new hearbeat_result();
        result.success = iface.hearbeat(args.heartBeat);
        return result;
      }
    }

  }

  public static class hearbeat_args implements org.apache.thrift.TBase<hearbeat_args, hearbeat_args._Fields>, java.io.Serializable, Cloneable, Comparable<hearbeat_args>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("hearbeat_args");

    private static final org.apache.thrift.protocol.TField HEART_BEAT_FIELD_DESC = new org.apache.thrift.protocol.TField("heartBeat", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new hearbeat_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new hearbeat_argsTupleSchemeFactory());
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      HEART_BEAT((short)1, "heartBeat");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // HEART_BEAT
            return HEART_BEAT;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.HEART_BEAT, new org.apache.thrift.meta_data.FieldMetaData("heartBeat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cgl.iotcloud.core.master.thrift.THeartBeatRequest.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(hearbeat_args.class, metaDataMap);
    }

    public hearbeat_args() {
    }

    public hearbeat_args(
      cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat)
    {
      this();
      this.heartBeat = heartBeat;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public hearbeat_args(hearbeat_args other) {
      if (other.isSetHeartBeat()) {
        this.heartBeat = new cgl.iotcloud.core.master.thrift.THeartBeatRequest(other.heartBeat);
      }
    }

    public hearbeat_args deepCopy() {
      return new hearbeat_args(this);
    }

    @Override
    public void clear() {
      this.heartBeat = null;
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatRequest getHeartBeat() {
      return this.heartBeat;
    }

    public hearbeat_args setHeartBeat(cgl.iotcloud.core.master.thrift.THeartBeatRequest heartBeat) {
      this.heartBeat = heartBeat;
      return this;
    }

    public void unsetHeartBeat() {
      this.heartBeat = null;
    }

    /** Returns true if field heartBeat is set (has been assigned a value) and false otherwise */
    public boolean isSetHeartBeat() {
      return this.heartBeat != null;
    }

    public void setHeartBeatIsSet(boolean value) {
      if (!value) {
        this.heartBeat = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case HEART_BEAT:
        if (value == null) {
          unsetHeartBeat();
        } else {
          setHeartBeat((cgl.iotcloud.core.master.thrift.THeartBeatRequest)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case HEART_BEAT:
        return getHeartBeat();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case HEART_BEAT:
        return isSetHeartBeat();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof hearbeat_args)
        return this.equals((hearbeat_args)that);
      return false;
    }

    public boolean equals(hearbeat_args that) {
      if (that == null)
        return false;

      boolean this_present_heartBeat = true && this.isSetHeartBeat();
      boolean that_present_heartBeat = true && that.isSetHeartBeat();
      if (this_present_heartBeat || that_present_heartBeat) {
        if (!(this_present_heartBeat && that_present_heartBeat))
          return false;
        if (!this.heartBeat.equals(that.heartBeat))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(hearbeat_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetHeartBeat()).compareTo(other.isSetHeartBeat());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetHeartBeat()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.heartBeat, other.heartBeat);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("hearbeat_args(");
      boolean first = true;

      sb.append("heartBeat:");
      if (this.heartBeat == null) {
        sb.append("null");
      } else {
        sb.append(this.heartBeat);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (heartBeat != null) {
        heartBeat.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class hearbeat_argsStandardSchemeFactory implements SchemeFactory {
      public hearbeat_argsStandardScheme getScheme() {
        return new hearbeat_argsStandardScheme();
      }
    }

    private static class hearbeat_argsStandardScheme extends StandardScheme<hearbeat_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, hearbeat_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // HEART_BEAT
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.heartBeat = new cgl.iotcloud.core.master.thrift.THeartBeatRequest();
                struct.heartBeat.read(iprot);
                struct.setHeartBeatIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, hearbeat_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.heartBeat != null) {
          oprot.writeFieldBegin(HEART_BEAT_FIELD_DESC);
          struct.heartBeat.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class hearbeat_argsTupleSchemeFactory implements SchemeFactory {
      public hearbeat_argsTupleScheme getScheme() {
        return new hearbeat_argsTupleScheme();
      }
    }

    private static class hearbeat_argsTupleScheme extends TupleScheme<hearbeat_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, hearbeat_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetHeartBeat()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetHeartBeat()) {
          struct.heartBeat.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, hearbeat_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.heartBeat = new cgl.iotcloud.core.master.thrift.THeartBeatRequest();
          struct.heartBeat.read(iprot);
          struct.setHeartBeatIsSet(true);
        }
      }
    }

  }

  public static class hearbeat_result implements org.apache.thrift.TBase<hearbeat_result, hearbeat_result._Fields>, java.io.Serializable, Cloneable, Comparable<hearbeat_result>   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("hearbeat_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new hearbeat_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new hearbeat_resultTupleSchemeFactory());
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatResponse success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, cgl.iotcloud.core.master.thrift.THeartBeatResponse.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(hearbeat_result.class, metaDataMap);
    }

    public hearbeat_result() {
    }

    public hearbeat_result(
      cgl.iotcloud.core.master.thrift.THeartBeatResponse success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public hearbeat_result(hearbeat_result other) {
      if (other.isSetSuccess()) {
        this.success = new cgl.iotcloud.core.master.thrift.THeartBeatResponse(other.success);
      }
    }

    public hearbeat_result deepCopy() {
      return new hearbeat_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public cgl.iotcloud.core.master.thrift.THeartBeatResponse getSuccess() {
      return this.success;
    }

    public hearbeat_result setSuccess(cgl.iotcloud.core.master.thrift.THeartBeatResponse success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((cgl.iotcloud.core.master.thrift.THeartBeatResponse)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof hearbeat_result)
        return this.equals((hearbeat_result)that);
      return false;
    }

    public boolean equals(hearbeat_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    @Override
    public int compareTo(hearbeat_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("hearbeat_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class hearbeat_resultStandardSchemeFactory implements SchemeFactory {
      public hearbeat_resultStandardScheme getScheme() {
        return new hearbeat_resultStandardScheme();
      }
    }

    private static class hearbeat_resultStandardScheme extends StandardScheme<hearbeat_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, hearbeat_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new cgl.iotcloud.core.master.thrift.THeartBeatResponse();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, hearbeat_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class hearbeat_resultTupleSchemeFactory implements SchemeFactory {
      public hearbeat_resultTupleScheme getScheme() {
        return new hearbeat_resultTupleScheme();
      }
    }

    private static class hearbeat_resultTupleScheme extends TupleScheme<hearbeat_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, hearbeat_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, hearbeat_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new cgl.iotcloud.core.master.thrift.THeartBeatResponse();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
