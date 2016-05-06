package br.usp.easytripdatabase;

import conexaoDB.*;
public class usuarios {
	/*public static void main (String[] args){
		System.out.println(getAutenticacaoUsuario("lucas@localhost.com", "senha"));
	}*/
	conexaoDB.Usuario conexao;
	public usuarios(){
		this.conexao = new conexaoDB.Usuario();
	}
	
	public int getAutenticacaoUsuario(String email, String senha){
		return conexao.usuarioExiste(email, senha);
	}
	
	public int getCPF(int id){
		return conexao.getCPF(id);
	}
	
	public int getCPF(String email, String senha){
		return conexao.getCPF(email, senha);
	}
}
