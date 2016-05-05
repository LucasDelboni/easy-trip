package br.usp.easytripdatabase;

import conexaoDB.*;
public class usuarios {
	/*public static void main (String[] args){
		System.out.println(getAutenticacaoUsuario("lucas@localhost.com", "senha"));
	}*/
	public int getAutenticacaoUsuario(String email, String senha){
		conexaoDB.Usuario objeto = new conexaoDB.Usuario();
		return objeto.usuarioExiste(email, senha);
	}
}
