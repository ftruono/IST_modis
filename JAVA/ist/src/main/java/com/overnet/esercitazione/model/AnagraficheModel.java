package com.overnet.esercitazione.model;

import java.io.Serializable;
import java.util.Date;

public class AnagraficheModel implements Serializable {
	
	private static final long serialVersionUID = 5772264300000000001L;
	
	private Long id;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String cf;
	private String nCellulare;
	
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getnCellulare() {
		return nCellulare;
	}
	public void setnCellulare(String nCellulare) {
		this.nCellulare = nCellulare;
	}
	
}
