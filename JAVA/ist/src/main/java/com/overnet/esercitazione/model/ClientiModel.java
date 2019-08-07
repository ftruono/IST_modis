package com.overnet.esercitazione.model;

import java.io.Serializable;
import java.util.Date;

public class ClientiModel implements Serializable {
	
	private static final long serialVersionUID = 5772264300000000001L;
	
	private Long id;
	
	public ClientiModel() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
