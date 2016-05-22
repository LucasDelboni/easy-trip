package br.usp.easytrip.bean;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import br.usp.easytrip.bean.interfaces.Login;
import br.usp.easytrip.jpa.dao.UsuarioDAO;

@Stateful
@LocalBean
public class LoginBean implements Login {
	
	@EJB
	private UsuarioDAO usuarioDAO;
	
	private boolean validaUsuario = false;
	private model.Usuario usuario;
	
	
	public boolean validaUsuario(String email, String senha) {
		if(!validaUsuario) {
			try{
				model.Usuario usuario = this.usuarioDAO.validaUsuario(email, senha);
				if(!usuario.getCpf().equals("null")){
					validaUsuario = true;
				}
			}
			catch(Exception e){
				System.out.println(e);;
			}
		}
		return validaUsuario;
	}
	
	public model.Usuario login(String email, String senha){
		this.usuario = this.usuarioDAO.validaUsuario(email, senha);
		return usuario;
	}
	
	@Remove
	public void logoff() {
		validaUsuario = false;
	}
}
