package com.overnet.esercitazione.model;

import java.math.BigDecimal;

public class StaffModel {
	private long id;
	private int idAnag;
	private BigDecimal livello;
	
	public StaffModel() {}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getIdAnag() {
		return idAnag;
	}
	public void setIdAnag(int idAnag) {
		this.idAnag = idAnag;
	}
	public BigDecimal getLivello() {
		return livello;
	}
	public void setLivello(BigDecimal livello) {
		this.livello = livello;
	}
}
