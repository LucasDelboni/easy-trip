/**
 * SomarService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.soma;

public interface SomarService extends javax.xml.rpc.Service {
    public java.lang.String getSomarAddress();

    public br.com.soma.Somar getSomar() throws javax.xml.rpc.ServiceException;

    public br.com.soma.Somar getSomar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
