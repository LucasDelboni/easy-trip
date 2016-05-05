package br.usp.easytripdatabase;

public class UsuariosProxy implements br.usp.easytripdatabase.Usuarios {
  private String _endpoint = null;
  private br.usp.easytripdatabase.Usuarios usuarios = null;
  
  public UsuariosProxy() {
    _initUsuariosProxy();
  }
  
  public UsuariosProxy(String endpoint) {
    _endpoint = endpoint;
    _initUsuariosProxy();
  }
  
  private void _initUsuariosProxy() {
    try {
      usuarios = (new br.usp.easytripdatabase.UsuariosServiceLocator()).getusuarios();
      if (usuarios != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)usuarios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)usuarios)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (usuarios != null)
      ((javax.xml.rpc.Stub)usuarios)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.usp.easytripdatabase.Usuarios getUsuarios() {
    if (usuarios == null)
      _initUsuariosProxy();
    return usuarios;
  }
  
  public int getAutenticacaoUsuario(java.lang.String email, java.lang.String senha) throws java.rmi.RemoteException{
    if (usuarios == null)
      _initUsuariosProxy();
    return usuarios.getAutenticacaoUsuario(email, senha);
  }
  
  
}