package br.usp.easytrip.jpa.dao;

import java.rmi.RemoteException;
import java.util.List;

import br.usp.easytrip.jpa.entities.Usuario;
import br.usp.easytripdatabase.UsuariosProxy;

public class UsuarioDAO {
	public List<Usuario> validaUsuario(String email, String senha) {
		//List<Usuario> login = 
		return null;
	}
	
	public int getIdUsuario(String email, String senha) throws RemoteException{
		UsuariosProxy sp = new UsuariosProxy();
		int id = sp.getUsuarios().getAutenticacaoUsuario(email, senha);
		return id;
	}
}
