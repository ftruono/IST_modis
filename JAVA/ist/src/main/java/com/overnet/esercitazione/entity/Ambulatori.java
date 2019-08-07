package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AMBULATORI database table.
 * 
 */
@Entity
@NamedQuery(name="Ambulatori.findAll", query="SELECT a FROM Ambulatori a")
public class Ambulatori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AMBULATORI_ID_GENERATOR", sequenceName="SEQ_AMBULATORI")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AMBULATORI_ID_GENERATOR")
	private long id;

	private String cod;

	private String nome;

	//bi-directional many-to-one association to Prenotazioni
	@OneToMany(mappedBy="ambulatori")
	private List<Prenotazioni> prenotazionis;

	//bi-directional many-to-many association to Terapie
	@ManyToMany(mappedBy="ambulatoris")
	private List<Terapie> terapies;

	public Ambulatori() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Prenotazioni> getPrenotazionis() {
		return this.prenotazionis;
	}

	public void setPrenotazionis(List<Prenotazioni> prenotazionis) {
		this.prenotazionis = prenotazionis;
	}

	public Prenotazioni addPrenotazioni(Prenotazioni prenotazioni) {
		getPrenotazionis().add(prenotazioni);
		prenotazioni.setAmbulatori(this);

		return prenotazioni;
	}

	public Prenotazioni removePrenotazioni(Prenotazioni prenotazioni) {
		getPrenotazionis().remove(prenotazioni);
		prenotazioni.setAmbulatori(null);

		return prenotazioni;
	}

	public List<Terapie> getTerapies() {
		return this.terapies;
	}

	public void setTerapies(List<Terapie> terapies) {
		this.terapies = terapies;
	}

}