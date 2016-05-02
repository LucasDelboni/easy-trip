/**
 * Weather.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public interface Weather extends javax.xml.rpc.Service {
    public java.lang.String getWeatherSoapAddress();

    public com.cdyne.ws.WeatherWS.WeatherSoap getWeatherSoap() throws javax.xml.rpc.ServiceException;

    public com.cdyne.ws.WeatherWS.WeatherSoap getWeatherSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
