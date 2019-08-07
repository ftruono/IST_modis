package com.overnet.esercitazione.model;

import java.sql.Date;

public class PrenotazioneModel {
	private long id;
	private int idAmbulatorio;
	private int idCliente;
	private Date dataOra;
	private int attivo;
	private String patologia;
	
	public PrenotazioneModel() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getIdAmbulatorio() {
		return idAmbulatorio;
	}
	public void setIdAmbulatorio(int idAmbulatorio) {
		this.idAmbulatorio = idAmbulatorio;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public Date getDataOra() {
		return dataOra;
	}
	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}
	public int getAttivo() {
		return attivo;
	}
	public void setAttivo(int attivo) {
		this.attivo = attivo;
	}
	public String getPatologia() {
		return patologia;
	}
	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
}
