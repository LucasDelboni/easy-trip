package br.usp.easytrip.jpa.dao;

import java.rmi.RemoteException;

import com.cdyne.ws.WeatherWS.WeatherSoapProxy;

import NET.webserviceX.www.ConvertTemperatureSoapProxy;
import br.usp.easytripdatabase.*;

public class ChamadasAPISOAP {
	public String getTemperaturaZipCode(String zipCode) throws RemoteException{
    	WeatherSoapProxy wc = new WeatherSoapProxy();
		String temperaturaZipCode = wc.getCityForecastByZIP(zipCode).getForecastResult()[0].getTemperatures().getMorningLow();
		String t = wc.getCityWeatherByZIP(zipCode).getTemperature();
		return t;
    }
	
	public double fahrenheitToCelsius(String temperaturaFahrenheit) throws RemoteException{
    	ConvertTemperatureSoapProxy cc = new ConvertTemperatureSoapProxy();
	    double fahrenheit = Double.parseDouble(temperaturaFahrenheit);
	    double temperaturaCelsius = cc.convertTemp(fahrenheit,"degreeFahrenheit" , "degreeCelsius");
		return temperaturaCelsius;
    }
}
