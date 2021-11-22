package com.example.apologise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cafe")
public class Cafe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cafePreto;
	
	private String cafeComLeite;
	
	private String capuccino;
	
	private String frappuccino;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCafePreto() {
		return cafePreto;
	}

	public void setCafePreto(String cafePreto) {
		this.cafePreto = cafePreto;
	}

	public String getCafeComLeite() {
		return cafeComLeite;
	}

	public void setCafeComLeite(String cafeComLeite) {
		this.cafeComLeite = cafeComLeite;
	}

	public String getCapuccino() {
		return capuccino;
	}

	public void setCapuccino(String capuccino) {
		this.capuccino = capuccino;
	}

	public String getFrappuccino() {
		return frappuccino;
	}

	public void setFrappuccino(String frappuccino) {
		this.frappuccino = frappuccino;
	}

}
