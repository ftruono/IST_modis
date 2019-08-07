package com.overnet.esercitazione.model;

import java.io.Serializable;
import java.util.Date;

public class AmbulatoriModel implements Serializable {
	
	private static final long serialVersionUID = 5772264300000000001L;
	
	private Long id;
	private String nome;
	private String cod;
	
	public AmbulatoriModel() {
		super();
	}
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
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	
}
