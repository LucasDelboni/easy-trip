package NET.webserviceX.www;

public class ConvertTemperatureSoapProxy implements NET.webserviceX.www.ConvertTemperatureSoap {
  private String _endpoint = null;
  private NET.webserviceX.www.ConvertTemperatureSoap convertTemperatureSoap = null;
  
  public ConvertTemperatureSoapProxy() {
    _initConvertTemperatureSoapProxy();
  }
  
  public ConvertTemperatureSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initConvertTemperatureSoapProxy();
  }
  
  private void _initConvertTemperatureSoapProxy() {
    try {
      convertTemperatureSoap = (new NET.webserviceX.www.ConvertTemperatureLocator()).getConvertTemperatureSoap();
      if (convertTemperatureSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)convertTemperatureSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)convertTemperatureSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (convertTemperatureSoap != null)
      ((javax.xml.rpc.Stub)convertTemperatureSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public NET.webserviceX.www.ConvertTemperatureSoap getConvertTemperatureSoap() {
    if (convertTemperatureSoap == null)
      _initConvertTemperatureSoapProxy();
    return convertTemperatureSoap;
  }
  
  public double convertTemp(double temperature, String fromUnit, String toUnit) throws java.rmi.RemoteException{
    if (convertTemperatureSoap == null)
      _initConvertTemperatureSoapProxy();
    return convertTemperatureSoap.convertTemp(temperature, fromUnit, toUnit);
  }
  
  
}