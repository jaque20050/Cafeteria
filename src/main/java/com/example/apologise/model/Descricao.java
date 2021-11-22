package com.example.apologise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_descricao")
public class Descricao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long tamanho;
	
	private Long preco;
	
	private String quente;
	
	private String frio;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public long getTamanho() {
		return tamanho;
	}
	public void setTamanho(long tamanho) {
		this.tamanho = tamanho;
	}
	public Long getPreco() {
		return preco;
	}
	public void setPreco(Long preco) {
		this.preco = preco;
	}
	public String getQuente() {
		return quente;
	}
	public void setQuente(String quente) {
		this.quente = quente;
	}
	public String getFrio() {
		return frio;
	}
	public void setFrio(String frio) {
		this.frio = frio;
	}
}
