package br.usp.easytrip.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario", schema="public")
public class Usuario {
	
	@Id
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="senha", nullable=false)
	private String senha;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="cpf", nullable=false, unique=true)
	private String cpf;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}