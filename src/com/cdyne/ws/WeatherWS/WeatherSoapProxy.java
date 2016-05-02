package com.cdyne.ws.WeatherWS;

public class WeatherSoapProxy implements com.cdyne.ws.WeatherWS.WeatherSoap {
  private String _endpoint = null;
  private com.cdyne.ws.WeatherWS.WeatherSoap weatherSoap = null;
  
  public WeatherSoapProxy() {
    _initWeatherSoapProxy();
  }
  
  public WeatherSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherSoapProxy();
  }
  
  private void _initWeatherSoapProxy() {
    try {
      weatherSoap = (new com.cdyne.ws.WeatherWS.WeatherLocator()).getWeatherSoap();
      if (weatherSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weatherSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weatherSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weatherSoap != null)
      ((javax.xml.rpc.Stub)weatherSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cdyne.ws.WeatherWS.WeatherSoap getWeatherSoap() {
    if (weatherSoap == null)
      _initWeatherSoapProxy();
    return weatherSoap;
  }
  
  public com.cdyne.ws.WeatherWS.WeatherDescription[] getWeatherInformation() throws java.rmi.RemoteException{
    if (weatherSoap == null)
      _initWeatherSoapProxy();
    return weatherSoap.getWeatherInformation();
  }
  
  public com.cdyne.ws.WeatherWS.ForecastReturn getCityForecastByZIP(java.lang.String ZIP) throws java.rmi.RemoteException{
    if (weatherSoap == null)
      _initWeatherSoapProxy();
    return weatherSoap.getCityForecastByZIP(ZIP);
  }
  
  public com.cdyne.ws.WeatherWS.WeatherReturn getCityWeatherByZIP(java.lang.String ZIP) throws java.rmi.RemoteException{
    if (weatherSoap == null)
      _initWeatherSoapProxy();
    return weatherSoap.getCityWeatherByZIP(ZIP);
  }
  
  
}