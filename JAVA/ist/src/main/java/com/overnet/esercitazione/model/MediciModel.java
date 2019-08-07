package com.overnet.esercitazione.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class MediciModel implements Serializable {
	
	private static final long serialVersionUID = 5772264300000000001L;
	
	private Long id;
	private BigDecimal isMedico;
	
	public MediciModel() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getIsMedico() {
		return isMedico;
	}
	public void setIsMedico(BigDecimal isMedico) {
		this.isMedico = isMedico;
	}
	
	
}
