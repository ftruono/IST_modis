package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the STAFF database table.
 * 
 */
@Entity
@NamedQuery(name="Staff.findAll", query="SELECT s FROM Staff s")
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STAFF_ID_GENERATOR", sequenceName="SEQ_STAFF")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STAFF_ID_GENERATOR")
	private long id;

	private BigDecimal livello;

	//bi-directional many-to-one association to Anagrafiche
	@ManyToOne
	@JoinColumn(name="ID_ANAG")
	private Anagrafiche anagrafiche;

	public Staff() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getLivello() {
		return this.livello;
	}

	public void setLivello(BigDecimal livello) {
		this.livello = livello;
	}

	public Anagrafiche getAnagrafiche() {
		return this.anagrafiche;
	}

	public void setAnagrafiche(Anagrafiche anagrafiche) {
		this.anagrafiche = anagrafiche;
	}

}