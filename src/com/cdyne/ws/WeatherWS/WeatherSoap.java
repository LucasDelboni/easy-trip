/**
 * WeatherSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws.WeatherWS;

public interface WeatherSoap extends java.rmi.Remote {

    /**
     * Gets Information for each WeatherID
     */
    public com.cdyne.ws.WeatherWS.WeatherDescription[] getWeatherInformation() throws java.rmi.RemoteException;

    /**
     * Allows you to get your City Forecast Over the Next 7 Days,
     * which is updated hourly. U.S. Only
     */
    public com.cdyne.ws.WeatherWS.ForecastReturn getCityForecastByZIP(java.lang.String ZIP) throws java.rmi.RemoteException;

    /**
     * Allows you to get your City's Weather, which is updated hourly.
     * U.S. Only
     */
    public com.cdyne.ws.WeatherWS.WeatherReturn getCityWeatherByZIP(java.lang.String ZIP) throws java.rmi.RemoteException;
}
