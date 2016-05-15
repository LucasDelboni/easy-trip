package br.usp.easytrip.bean.interfaces;

import javax.ejb.Local;

@Local
public interface Login {

	public boolean validaUsuario(String email, String senha);
	public void logoff();
}