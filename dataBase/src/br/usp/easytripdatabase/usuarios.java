package br.usp.easytripdatabase;

import conexaoDB.*;
public class usuarios {
	/*
	public static void main (String[] args){
		conexaoDB.Usuario con = new conexaoDB.Usuario();
		System.out.println(con.usuarioExiste("lucas@localhost.com", "senha"));
		System.out.println(con.insertUsuario("a", "b", "c", "d"));
	}*/
	
	conexaoDB.Usuario conexao;
	public usuarios(){
		this.conexao = new conexaoDB.Usuario();
	}
	
	public boolean insertUsuario(String nome, String email, String senha, String cpf){
		return conexao.insertUsuario( nome,email,senha, cpf);
	}
	
	public int getAutenticacaoUsuario(String email, String senha){
		return conexao.usuarioExiste(email, senha);
	}
	
	public int getCPF(String email, String senha){
		return conexao.getCPF(email, senha);
	}
	
	public model.Usuario getUsuario(String email, String senha){
		model.Usuario user = conexao.getUsuario(email, senha);
		return user;
	}
	
	
}
