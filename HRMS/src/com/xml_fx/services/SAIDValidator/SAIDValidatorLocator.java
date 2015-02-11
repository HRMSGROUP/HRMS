/**
 * SAIDValidatorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xml_fx.services.SAIDValidator;

public class SAIDValidatorLocator extends org.apache.axis.client.Service implements com.xml_fx.services.SAIDValidator.SAIDValidator {

    public SAIDValidatorLocator() {
    }


    public SAIDValidatorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SAIDValidatorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SAIDValidatorSoap
    private java.lang.String SAIDValidatorSoap_address = "http://xml-fx.com/services/SAIDValidator/SAIDValidator.asmx";

    public java.lang.String getSAIDValidatorSoapAddress() {
        return SAIDValidatorSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SAIDValidatorSoapWSDDServiceName = "SAIDValidatorSoap";

    public java.lang.String getSAIDValidatorSoapWSDDServiceName() {
        return SAIDValidatorSoapWSDDServiceName;
    }

    public void setSAIDValidatorSoapWSDDServiceName(java.lang.String name) {
        SAIDValidatorSoapWSDDServiceName = name;
    }

    public com.xml_fx.services.SAIDValidator.SAIDValidatorSoap getSAIDValidatorSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SAIDValidatorSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSAIDValidatorSoap(endpoint);
    }

    public com.xml_fx.services.SAIDValidator.SAIDValidatorSoap getSAIDValidatorSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.xml_fx.services.SAIDValidator.SAIDValidatorSoapStub _stub = new com.xml_fx.services.SAIDValidator.SAIDValidatorSoapStub(portAddress, this);
            _stub.setPortName(getSAIDValidatorSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSAIDValidatorSoapEndpointAddress(java.lang.String address) {
        SAIDValidatorSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.xml_fx.services.SAIDValidator.SAIDValidatorSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.xml_fx.services.SAIDValidator.SAIDValidatorSoapStub _stub = new com.xml_fx.services.SAIDValidator.SAIDValidatorSoapStub(new java.net.URL(SAIDValidatorSoap_address), this);
                _stub.setPortName(getSAIDValidatorSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SAIDValidatorSoap".equals(inputPortName)) {
            return getSAIDValidatorSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/", "SAIDValidator");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml-fx.com/services/SAIDValidator/", "SAIDValidatorSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SAIDValidatorSoap".equals(portName)) {
            setSAIDValidatorSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
