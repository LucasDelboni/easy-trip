package br.usp.easytrip.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import br.usp.easytrip.bean.interfaces.Login;
import br.usp.easytrip.jpa.dao.UsuarioDAO;
import br.usp.easytrip.jpa.entities.Usuario;

@Stateful
@LocalBean
public class LoginBean implements Login {
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	private boolean validaUsuario = false;
	
	public boolean validaUsuario(String email, String senha) {
		if(!validaUsuario) {
			try{
				model.Usuario a = this.usuarioDAO.validaUsuario(email, senha);
				if(a.getCpf()!="null"){
					validaUsuario = true;
				}
			}
			catch(Exception e){
				return validaUsuario;
			}
			
		}
		return validaUsuario;
	}
	
	@Remove
	public void logoff() {
		validaUsuario = false;
	}
}
