package com.xml_fx.services.SAIDValidator;

public class SAIDValidatorSoapProxy implements com.xml_fx.services.SAIDValidator.SAIDValidatorSoap {
  private String _endpoint = null;
  private com.xml_fx.services.SAIDValidator.SAIDValidatorSoap sAIDValidatorSoap = null;
  
  public SAIDValidatorSoapProxy() {
    _initSAIDValidatorSoapProxy();
  }
  
  public SAIDValidatorSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initSAIDValidatorSoapProxy();
  }
  
  private void _initSAIDValidatorSoapProxy() {
    try {
      sAIDValidatorSoap = (new com.xml_fx.services.SAIDValidator.SAIDValidatorLocator()).getSAIDValidatorSoap();
      if (sAIDValidatorSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sAIDValidatorSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sAIDValidatorSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sAIDValidatorSoap != null)
      ((javax.xml.rpc.Stub)sAIDValidatorSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.xml_fx.services.SAIDValidator.SAIDValidatorSoap getSAIDValidatorSoap() {
    if (sAIDValidatorSoap == null)
      _initSAIDValidatorSoapProxy();
    return sAIDValidatorSoap;
  }
  
  public java.lang.String getServiceIdentifier() throws java.rmi.RemoteException{
    if (sAIDValidatorSoap == null)
      _initSAIDValidatorSoapProxy();
    return sAIDValidatorSoap.getServiceIdentifier();
  }
  
  public com.xml_fx.services.SAIDValidator.said_xsd.SaidType validateIdString(java.lang.String authToken, java.lang.String said) throws java.rmi.RemoteException{
    if (sAIDValidatorSoap == null)
      _initSAIDValidatorSoapProxy();
    return sAIDValidatorSoap.validateIdString(authToken, said);
  }
  
  
}