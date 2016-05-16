package br.usp.easytrip.jpa.dao;

import java.rmi.RemoteException;
import java.util.List;

import br.usp.easytrip.jpa.entities.Usuario;
import br.usp.easytripdatabase.UsuariosProxy;

public class UsuarioDAO {
	public model.Usuario validaUsuario(String email, String senha) {
		UsuariosProxy us = new UsuariosProxy();
        model.Usuario a = null;
		try {
			a = us.getUsuarios().getUsuario(email, senha);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	public int getIdUsuario(String email, String senha) throws RemoteException{
		UsuariosProxy sp = new UsuariosProxy();
		int id = sp.getUsuarios().getAutenticacaoUsuario(email, senha);
		return id;
	}
}
