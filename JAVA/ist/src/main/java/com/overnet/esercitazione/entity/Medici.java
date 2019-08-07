package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the MEDICI database table.
 * 
 */
@Entity
@NamedQuery(name="Medici.findAll", query="SELECT m FROM Medici m")
public class Medici implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MEDICI_ID_GENERATOR", sequenceName="SEQ_MEDICI")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEDICI_ID_GENERATOR")
	private long id;

	private BigDecimal ismedico;

	//bi-directional many-to-one association to Anagrafiche
	@ManyToOne
	@JoinColumn(name="ID_ANAG")
	private Anagrafiche anagrafiche;

	//bi-directional many-to-many association to Terapie
	@ManyToMany
	@JoinTable(
		name="MEDICI_TERAPIE"
		, joinColumns={
			@JoinColumn(name="ID_MEDICO")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_TERAPIA")
			}
		)
	private List<Terapie> terapies;

	public Medici() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getIsmedico() {
		return this.ismedico;
	}

	public void setIsmedico(BigDecimal ismedico) {
		this.ismedico = ismedico;
	}

	public Anagrafiche getAnagrafiche() {
		return this.anagrafiche;
	}

	public void setAnagrafiche(Anagrafiche anagrafiche) {
		this.anagrafiche = anagrafiche;
	}

	public List<Terapie> getTerapies() {
		return this.terapies;
	}

	public void setTerapies(List<Terapie> terapies) {
		this.terapies = terapies;
	}

}