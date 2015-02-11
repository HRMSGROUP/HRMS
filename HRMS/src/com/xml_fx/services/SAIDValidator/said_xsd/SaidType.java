/**
 * SaidType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xml_fx.services.SAIDValidator.said_xsd;

public class SaidType  implements java.io.Serializable {
    private java.lang.String input;

    private com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutput output;

    private boolean valid;  // attribute

    private org.apache.axis.types.UnsignedInt error;  // attribute

    public SaidType() {
    }

    public SaidType(
           java.lang.String input,
           com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutput output,
           boolean valid,
           org.apache.axis.types.UnsignedInt error) {
           this.input = input;
           this.output = output;
           this.valid = valid;
           this.error = error;
    }


    /**
     * Gets the input value for this SaidType.
     * 
     * @return input
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this SaidType.
     * 
     * @param input
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the output value for this SaidType.
     * 
     * @return output
     */
    public com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutput getOutput() {
        return output;
    }


    /**
     * Sets the output value for this SaidType.
     * 
     * @param output
     */
    public void setOutput(com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutput output) {
        this.output = output;
    }


    /**
     * Gets the valid value for this SaidType.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this SaidType.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the error value for this SaidType.
     * 
     * @return error
     */
    public org.apache.axis.types.UnsignedInt getError() {
        return error;
    }


    /**
     * Sets the error value for this SaidType.
     * 
     * @param error
     */
    public void setError(org.apache.axis.types.UnsignedInt error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaidType)) return false;
        SaidType other = (SaidType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            this.valid == other.isValid() &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaidType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "saidType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("valid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Valid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("error");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", ">saidType>output"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
