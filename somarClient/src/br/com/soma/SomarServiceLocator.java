/**
 * SomarServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.soma;

public class SomarServiceLocator extends org.apache.axis.client.Service implements br.com.soma.SomarService {

    public SomarServiceLocator() {
    }


    public SomarServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SomarServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Somar
    private java.lang.String Somar_address = "http://localhost:8080/somar/services/Somar";

    public java.lang.String getSomarAddress() {
        return Somar_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SomarWSDDServiceName = "Somar";

    public java.lang.String getSomarWSDDServiceName() {
        return SomarWSDDServiceName;
    }

    public void setSomarWSDDServiceName(java.lang.String name) {
        SomarWSDDServiceName = name;
    }

    public br.com.soma.Somar getSomar() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Somar_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSomar(endpoint);
    }

    public br.com.soma.Somar getSomar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.soma.SomarSoapBindingStub _stub = new br.com.soma.SomarSoapBindingStub(portAddress, this);
            _stub.setPortName(getSomarWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSomarEndpointAddress(java.lang.String address) {
        Somar_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.soma.Somar.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.soma.SomarSoapBindingStub _stub = new br.com.soma.SomarSoapBindingStub(new java.net.URL(Somar_address), this);
                _stub.setPortName(getSomarWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Somar".equals(inputPortName)) {
            return getSomar();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soma.com.br", "SomarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soma.com.br", "Somar"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Somar".equals(portName)) {
            setSomarEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
