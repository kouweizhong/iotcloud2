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
package cgl.iotcloud.core.api.thrift;

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

@SuppressWarnings("all") public class TChannel implements org.apache.thrift.TBase<TChannel, TChannel._Fields>, java.io.Serializable, Cloneable, Comparable<TChannel> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TChannel");

  private static final org.apache.thrift.protocol.TField TRANSPORT_FIELD_DESC = new org.apache.thrift.protocol.TField("transport", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DIRECTION_FIELD_DESC = new org.apache.thrift.protocol.TField("direction", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PROPERTIES_FIELD_DESC = new org.apache.thrift.protocol.TField("properties", org.apache.thrift.protocol.TType.MAP, (short)3);
  private static final org.apache.thrift.protocol.TField BROKER_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("brokerUrl", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TChannelStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TChannelTupleSchemeFactory());
  }

  public String transport; // required
  /**
   * 
   * @see TDirection
   */
  public TDirection direction; // required
  public Map<String,String> properties; // optional
  public String brokerUrl; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  @SuppressWarnings("all") public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TRANSPORT((short)1, "transport"),
    /**
     * 
     * @see TDirection
     */
    DIRECTION((short)2, "direction"),
    PROPERTIES((short)3, "properties"),
    BROKER_URL((short)4, "brokerUrl");

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
        case 1: // TRANSPORT
          return TRANSPORT;
        case 2: // DIRECTION
          return DIRECTION;
        case 3: // PROPERTIES
          return PROPERTIES;
        case 4: // BROKER_URL
          return BROKER_URL;
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
  private _Fields optionals[] = {_Fields.PROPERTIES,_Fields.BROKER_URL};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TRANSPORT, new org.apache.thrift.meta_data.FieldMetaData("transport", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DIRECTION, new org.apache.thrift.meta_data.FieldMetaData("direction", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TDirection.class)));
    tmpMap.put(_Fields.PROPERTIES, new org.apache.thrift.meta_data.FieldMetaData("properties", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.BROKER_URL, new org.apache.thrift.meta_data.FieldMetaData("brokerUrl", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TChannel.class, metaDataMap);
  }

  public TChannel() {
  }

  public TChannel(
    String transport,
    TDirection direction)
  {
    this();
    this.transport = transport;
    this.direction = direction;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TChannel(TChannel other) {
    if (other.isSetTransport()) {
      this.transport = other.transport;
    }
    if (other.isSetDirection()) {
      this.direction = other.direction;
    }
    if (other.isSetProperties()) {
      Map<String,String> __this__properties = new HashMap<String,String>(other.properties);
      this.properties = __this__properties;
    }
    if (other.isSetBrokerUrl()) {
      this.brokerUrl = other.brokerUrl;
    }
  }

  public TChannel deepCopy() {
    return new TChannel(this);
  }

  @Override
  public void clear() {
    this.transport = null;
    this.direction = null;
    this.properties = null;
    this.brokerUrl = null;
  }

  public String getTransport() {
    return this.transport;
  }

  public TChannel setTransport(String transport) {
    this.transport = transport;
    return this;
  }

  public void unsetTransport() {
    this.transport = null;
  }

  /** Returns true if field transport is set (has been assigned a value) and false otherwise */
  public boolean isSetTransport() {
    return this.transport != null;
  }

  public void setTransportIsSet(boolean value) {
    if (!value) {
      this.transport = null;
    }
  }

  /**
   * 
   * @see TDirection
   */
  public TDirection getDirection() {
    return this.direction;
  }

  /**
   * 
   * @see TDirection
   */
  public TChannel setDirection(TDirection direction) {
    this.direction = direction;
    return this;
  }

  public void unsetDirection() {
    this.direction = null;
  }

  /** Returns true if field direction is set (has been assigned a value) and false otherwise */
  public boolean isSetDirection() {
    return this.direction != null;
  }

  public void setDirectionIsSet(boolean value) {
    if (!value) {
      this.direction = null;
    }
  }

  public int getPropertiesSize() {
    return (this.properties == null) ? 0 : this.properties.size();
  }

  public void putToProperties(String key, String val) {
    if (this.properties == null) {
      this.properties = new HashMap<String,String>();
    }
    this.properties.put(key, val);
  }

  public Map<String,String> getProperties() {
    return this.properties;
  }

  public TChannel setProperties(Map<String,String> properties) {
    this.properties = properties;
    return this;
  }

  public void unsetProperties() {
    this.properties = null;
  }

  /** Returns true if field properties is set (has been assigned a value) and false otherwise */
  public boolean isSetProperties() {
    return this.properties != null;
  }

  public void setPropertiesIsSet(boolean value) {
    if (!value) {
      this.properties = null;
    }
  }

  public String getBrokerUrl() {
    return this.brokerUrl;
  }

  public TChannel setBrokerUrl(String brokerUrl) {
    this.brokerUrl = brokerUrl;
    return this;
  }

  public void unsetBrokerUrl() {
    this.brokerUrl = null;
  }

  /** Returns true if field brokerUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetBrokerUrl() {
    return this.brokerUrl != null;
  }

  public void setBrokerUrlIsSet(boolean value) {
    if (!value) {
      this.brokerUrl = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TRANSPORT:
      if (value == null) {
        unsetTransport();
      } else {
        setTransport((String)value);
      }
      break;

    case DIRECTION:
      if (value == null) {
        unsetDirection();
      } else {
        setDirection((TDirection)value);
      }
      break;

    case PROPERTIES:
      if (value == null) {
        unsetProperties();
      } else {
        setProperties((Map<String,String>)value);
      }
      break;

    case BROKER_URL:
      if (value == null) {
        unsetBrokerUrl();
      } else {
        setBrokerUrl((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TRANSPORT:
      return getTransport();

    case DIRECTION:
      return getDirection();

    case PROPERTIES:
      return getProperties();

    case BROKER_URL:
      return getBrokerUrl();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TRANSPORT:
      return isSetTransport();
    case DIRECTION:
      return isSetDirection();
    case PROPERTIES:
      return isSetProperties();
    case BROKER_URL:
      return isSetBrokerUrl();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TChannel)
      return this.equals((TChannel)that);
    return false;
  }

  public boolean equals(TChannel that) {
    if (that == null)
      return false;

    boolean this_present_transport = true && this.isSetTransport();
    boolean that_present_transport = true && that.isSetTransport();
    if (this_present_transport || that_present_transport) {
      if (!(this_present_transport && that_present_transport))
        return false;
      if (!this.transport.equals(that.transport))
        return false;
    }

    boolean this_present_direction = true && this.isSetDirection();
    boolean that_present_direction = true && that.isSetDirection();
    if (this_present_direction || that_present_direction) {
      if (!(this_present_direction && that_present_direction))
        return false;
      if (!this.direction.equals(that.direction))
        return false;
    }

    boolean this_present_properties = true && this.isSetProperties();
    boolean that_present_properties = true && that.isSetProperties();
    if (this_present_properties || that_present_properties) {
      if (!(this_present_properties && that_present_properties))
        return false;
      if (!this.properties.equals(that.properties))
        return false;
    }

    boolean this_present_brokerUrl = true && this.isSetBrokerUrl();
    boolean that_present_brokerUrl = true && that.isSetBrokerUrl();
    if (this_present_brokerUrl || that_present_brokerUrl) {
      if (!(this_present_brokerUrl && that_present_brokerUrl))
        return false;
      if (!this.brokerUrl.equals(that.brokerUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(TChannel other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTransport()).compareTo(other.isSetTransport());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransport()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transport, other.transport);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDirection()).compareTo(other.isSetDirection());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDirection()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.direction, other.direction);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProperties()).compareTo(other.isSetProperties());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProperties()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.properties, other.properties);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBrokerUrl()).compareTo(other.isSetBrokerUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBrokerUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.brokerUrl, other.brokerUrl);
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
    StringBuilder sb = new StringBuilder("TChannel(");
    boolean first = true;

    sb.append("transport:");
    if (this.transport == null) {
      sb.append("null");
    } else {
      sb.append(this.transport);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("direction:");
    if (this.direction == null) {
      sb.append("null");
    } else {
      sb.append(this.direction);
    }
    first = false;
    if (isSetProperties()) {
      if (!first) sb.append(", ");
      sb.append("properties:");
      if (this.properties == null) {
        sb.append("null");
      } else {
        sb.append(this.properties);
      }
      first = false;
    }
    if (isSetBrokerUrl()) {
      if (!first) sb.append(", ");
      sb.append("brokerUrl:");
      if (this.brokerUrl == null) {
        sb.append("null");
      } else {
        sb.append(this.brokerUrl);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TChannelStandardSchemeFactory implements SchemeFactory {
    public TChannelStandardScheme getScheme() {
      return new TChannelStandardScheme();
    }
  }

  private static class TChannelStandardScheme extends StandardScheme<TChannel> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TChannel struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TRANSPORT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.transport = iprot.readString();
              struct.setTransportIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DIRECTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.direction = TDirection.findByValue(iprot.readI32());
              struct.setDirectionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROPERTIES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.properties = new HashMap<String,String>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  String _key2;
                  String _val3;
                  _key2 = iprot.readString();
                  _val3 = iprot.readString();
                  struct.properties.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setPropertiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BROKER_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.brokerUrl = iprot.readString();
              struct.setBrokerUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TChannel struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.transport != null) {
        oprot.writeFieldBegin(TRANSPORT_FIELD_DESC);
        oprot.writeString(struct.transport);
        oprot.writeFieldEnd();
      }
      if (struct.direction != null) {
        oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
        oprot.writeI32(struct.direction.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.properties != null) {
        if (struct.isSetProperties()) {
          oprot.writeFieldBegin(PROPERTIES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.properties.size()));
            for (Map.Entry<String, String> _iter4 : struct.properties.entrySet())
            {
              oprot.writeString(_iter4.getKey());
              oprot.writeString(_iter4.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.brokerUrl != null) {
        if (struct.isSetBrokerUrl()) {
          oprot.writeFieldBegin(BROKER_URL_FIELD_DESC);
          oprot.writeString(struct.brokerUrl);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TChannelTupleSchemeFactory implements SchemeFactory {
    public TChannelTupleScheme getScheme() {
      return new TChannelTupleScheme();
    }
  }

  private static class TChannelTupleScheme extends TupleScheme<TChannel> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TChannel struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTransport()) {
        optionals.set(0);
      }
      if (struct.isSetDirection()) {
        optionals.set(1);
      }
      if (struct.isSetProperties()) {
        optionals.set(2);
      }
      if (struct.isSetBrokerUrl()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTransport()) {
        oprot.writeString(struct.transport);
      }
      if (struct.isSetDirection()) {
        oprot.writeI32(struct.direction.getValue());
      }
      if (struct.isSetProperties()) {
        {
          oprot.writeI32(struct.properties.size());
          for (Map.Entry<String, String> _iter5 : struct.properties.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
      if (struct.isSetBrokerUrl()) {
        oprot.writeString(struct.brokerUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TChannel struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.transport = iprot.readString();
        struct.setTransportIsSet(true);
      }
      if (incoming.get(1)) {
        struct.direction = TDirection.findByValue(iprot.readI32());
        struct.setDirectionIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.properties = new HashMap<String,String>(2*_map6.size);
          for (int _i7 = 0; _i7 < _map6.size; ++_i7)
          {
            String _key8;
            String _val9;
            _key8 = iprot.readString();
            _val9 = iprot.readString();
            struct.properties.put(_key8, _val9);
          }
        }
        struct.setPropertiesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.brokerUrl = iprot.readString();
        struct.setBrokerUrlIsSet(true);
      }
    }
  }

}

