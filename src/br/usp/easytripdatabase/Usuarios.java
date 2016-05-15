/**
 * Usuarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.easytripdatabase;

public interface Usuarios extends java.rmi.Remote {
    public boolean insertUsuario(java.lang.String nome, java.lang.String email, java.lang.String senha, java.lang.String cpf) throws java.rmi.RemoteException;
    public int getCPF(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException;
    public model.Usuario getUsuario(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException;
    public int getAutenticacaoUsuario(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException;
}
