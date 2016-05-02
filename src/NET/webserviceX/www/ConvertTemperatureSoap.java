/**
 * ConvertTemperatureSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NET.webserviceX.www;

public interface ConvertTemperatureSoap extends java.rmi.Remote {
    public double convertTemp(double temperature, String fromUnit, String toUnit) throws java.rmi.RemoteException;
}
