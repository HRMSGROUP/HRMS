/**
 * SAIDValidatorSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xml_fx.services.SAIDValidator;

public interface SAIDValidatorSoap extends java.rmi.Remote {
    public java.lang.String getServiceIdentifier() throws java.rmi.RemoteException;
    public com.xml_fx.services.SAIDValidator.said_xsd.SaidType validateIdString(java.lang.String authToken, java.lang.String said) throws java.rmi.RemoteException;
}
