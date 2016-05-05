package api;

import java.rmi.RemoteException;

import com.cdyne.ws.WeatherWS.WeatherSoapProxy;

import NET.webserviceX.www.ConvertTemperatureSoapProxy;
import conexaoDB.UsuarioProxy;

public class ChamadasAPISOAP {
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
	
	public int getIdUsuario(String email, String senha) throws RemoteException{
		UsuarioProxy sp = new UsuarioProxy();
		int id = sp.getUsuario().usuarioExiste(email, senha);
		return id;
	}

}
