package br.usp.easytrip.bean;

import java.rmi.RemoteException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.cdyne.ws.WeatherWS.WeatherSoapProxy;

import NET.webserviceX.www.ConvertTemperatureSoapProxy;

/**
 * Session Bean implementation class HelloBean
 */
@Stateless
@LocalBean
public class HelloBean {

    /**
     * Default constructor. 
     * @return 
     */
    public String from(){
    	return "EJB";
    }
    
    public String getTemperaturaZipCode(String zipCode) throws RemoteException{
    	WeatherSoapProxy wc = new WeatherSoapProxy();
		String temperaturaZipCode = wc.getCityForecastByZIP(zipCode).getForecastResult()[0].getTemperatures().getMorningLow();
		return temperaturaZipCode;
    }
    
    public double fahrenheitToCelsius(String temperaturaFahrenheit) throws RemoteException{
    	ConvertTemperatureSoapProxy cc = new ConvertTemperatureSoapProxy();
	    double fahrenheit = Double.parseDouble(temperaturaFahrenheit);
	    double temperaturaCelsius = cc.convertTemp(fahrenheit,"degreeFahrenheit" , "degreeCelsius");
		return temperaturaCelsius;
    }


}
