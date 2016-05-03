package br.com.soma;

public class SomarProxy implements br.com.soma.Somar {
  private String _endpoint = null;
  private br.com.soma.Somar somar = null;
  
  public SomarProxy() {
    _initSomarProxy();
  }
  
  public SomarProxy(String endpoint) {
    _endpoint = endpoint;
    _initSomarProxy();
  }
  
  private void _initSomarProxy() {
    try {
      somar = (new br.com.soma.SomarServiceLocator()).getSomar();
      if (somar != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)somar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)somar)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (somar != null)
      ((javax.xml.rpc.Stub)somar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.soma.Somar getSomar() {
    if (somar == null)
      _initSomarProxy();
    return somar;
  }
  
  public double sum(double a, double b) throws java.rmi.RemoteException{
    if (somar == null)
      _initSomarProxy();
    return somar.sum(a, b);
  }
  
  
}