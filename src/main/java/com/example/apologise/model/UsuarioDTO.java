package com.example.apologise.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UsuarioDTO {
	
	private Long id;
	
	private String nome;
	
	@NotBlank(message = "Necessário e-mail")
	@Email(message = "Necessário email")
	private String email;
	
	private String senha;
	
	private String token;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	

}
