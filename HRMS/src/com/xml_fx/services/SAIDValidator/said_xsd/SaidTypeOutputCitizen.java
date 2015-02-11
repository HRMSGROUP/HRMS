/**
 * SaidTypeOutputCitizen.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xml_fx.services.SAIDValidator.said_xsd;

public class SaidTypeOutputCitizen implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SaidTypeOutputCitizen(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Unknown = "Unknown";
    public static final java.lang.String _SA = "SA";
    public static final java.lang.String _Foreign = "Foreign";
    public static final SaidTypeOutputCitizen Unknown = new SaidTypeOutputCitizen(_Unknown);
    public static final SaidTypeOutputCitizen SA = new SaidTypeOutputCitizen(_SA);
    public static final SaidTypeOutputCitizen Foreign = new SaidTypeOutputCitizen(_Foreign);
    public java.lang.String getValue() { return _value_;}
    public static SaidTypeOutputCitizen fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SaidTypeOutputCitizen enumeration = (SaidTypeOutputCitizen)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SaidTypeOutputCitizen fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaidTypeOutputCitizen.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", ">>saidType>output>Citizen"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
