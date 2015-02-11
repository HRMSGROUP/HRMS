/**
 * SaidTypeOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xml_fx.services.SAIDValidator.said_xsd;

public class SaidTypeOutput  implements java.io.Serializable {
    private int CCD;

    private int CD;

    private com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputCitizen citizen;

    private java.util.Date DOB;

    private java.lang.String errorFlags;

    private com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputGender gender;

    private java.lang.String parsed;

    private org.apache.axis.types.UnsignedInt sequence;

    public SaidTypeOutput() {
    }

    public SaidTypeOutput(
           int CCD,
           int CD,
           com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputCitizen citizen,
           java.util.Date DOB,
           java.lang.String errorFlags,
           com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputGender gender,
           java.lang.String parsed,
           org.apache.axis.types.UnsignedInt sequence) {
           this.CCD = CCD;
           this.CD = CD;
           this.citizen = citizen;
           this.DOB = DOB;
           this.errorFlags = errorFlags;
           this.gender = gender;
           this.parsed = parsed;
           this.sequence = sequence;
    }


    /**
     * Gets the CCD value for this SaidTypeOutput.
     * 
     * @return CCD
     */
    public int getCCD() {
        return CCD;
    }


    /**
     * Sets the CCD value for this SaidTypeOutput.
     * 
     * @param CCD
     */
    public void setCCD(int CCD) {
        this.CCD = CCD;
    }


    /**
     * Gets the CD value for this SaidTypeOutput.
     * 
     * @return CD
     */
    public int getCD() {
        return CD;
    }


    /**
     * Sets the CD value for this SaidTypeOutput.
     * 
     * @param CD
     */
    public void setCD(int CD) {
        this.CD = CD;
    }


    /**
     * Gets the citizen value for this SaidTypeOutput.
     * 
     * @return citizen
     */
    public com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputCitizen getCitizen() {
        return citizen;
    }


    /**
     * Sets the citizen value for this SaidTypeOutput.
     * 
     * @param citizen
     */
    public void setCitizen(com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputCitizen citizen) {
        this.citizen = citizen;
    }


    /**
     * Gets the DOB value for this SaidTypeOutput.
     * 
     * @return DOB
     */
    public java.util.Date getDOB() {
        return DOB;
    }


    /**
     * Sets the DOB value for this SaidTypeOutput.
     * 
     * @param DOB
     */
    public void setDOB(java.util.Date DOB) {
        this.DOB = DOB;
    }


    /**
     * Gets the errorFlags value for this SaidTypeOutput.
     * 
     * @return errorFlags
     */
    public java.lang.String getErrorFlags() {
        return errorFlags;
    }


    /**
     * Sets the errorFlags value for this SaidTypeOutput.
     * 
     * @param errorFlags
     */
    public void setErrorFlags(java.lang.String errorFlags) {
        this.errorFlags = errorFlags;
    }


    /**
     * Gets the gender value for this SaidTypeOutput.
     * 
     * @return gender
     */
    public com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputGender getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SaidTypeOutput.
     * 
     * @param gender
     */
    public void setGender(com.xml_fx.services.SAIDValidator.said_xsd.SaidTypeOutputGender gender) {
        this.gender = gender;
    }


    /**
     * Gets the parsed value for this SaidTypeOutput.
     * 
     * @return parsed
     */
    public java.lang.String getParsed() {
        return parsed;
    }


    /**
     * Sets the parsed value for this SaidTypeOutput.
     * 
     * @param parsed
     */
    public void setParsed(java.lang.String parsed) {
        this.parsed = parsed;
    }


    /**
     * Gets the sequence value for this SaidTypeOutput.
     * 
     * @return sequence
     */
    public org.apache.axis.types.UnsignedInt getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this SaidTypeOutput.
     * 
     * @param sequence
     */
    public void setSequence(org.apache.axis.types.UnsignedInt sequence) {
        this.sequence = sequence;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaidTypeOutput)) return false;
        SaidTypeOutput other = (SaidTypeOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.CCD == other.getCCD() &&
            this.CD == other.getCD() &&
            ((this.citizen==null && other.getCitizen()==null) || 
             (this.citizen!=null &&
              this.citizen.equals(other.getCitizen()))) &&
            ((this.DOB==null && other.getDOB()==null) || 
             (this.DOB!=null &&
              this.DOB.equals(other.getDOB()))) &&
            ((this.errorFlags==null && other.getErrorFlags()==null) || 
             (this.errorFlags!=null &&
              this.errorFlags.equals(other.getErrorFlags()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.parsed==null && other.getParsed()==null) || 
             (this.parsed!=null &&
              this.parsed.equals(other.getParsed()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence())));
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
        _hashCode += getCCD();
        _hashCode += getCD();
        if (getCitizen() != null) {
            _hashCode += getCitizen().hashCode();
        }
        if (getDOB() != null) {
            _hashCode += getDOB().hashCode();
        }
        if (getErrorFlags() != null) {
            _hashCode += getErrorFlags().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getParsed() != null) {
            _hashCode += getParsed().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaidTypeOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", ">saidType>output"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "CCD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "CD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citizen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "Citizen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", ">>saidType>output>Citizen"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "DOB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "ErrorFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", ">>saidType>output>Gender"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "Parsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/said.xsd", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
