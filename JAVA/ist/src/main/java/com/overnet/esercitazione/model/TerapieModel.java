
package com.overnet.esercitazione.model;

import java.io.Serializable;
import java.util.Date;

public class TerapieModel implements Serializable {

	private static final long serialVersionUID = 5772264326922388801L;
	private long id;
	private String nome;
	private String cod;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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

	public TerapieModel(){}

}