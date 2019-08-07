package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CLIENTI database table.
 * 
 */
@Entity
@NamedQuery(name="Clienti.findAll", query="SELECT c FROM Clienti c")
public class Clienti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENTI_ID_GENERATOR", sequenceName="SEQ_CLIENTI")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTI_ID_GENERATOR")
	private long id;

	//bi-directional many-to-one association to Anagrafiche
	@ManyToOne
	@JoinColumn(name="ID_ANAG")
	private Anagrafiche anagrafiche;

	//bi-directional many-to-one association to Prenotazioni
	@OneToMany(mappedBy="clienti")
	private List<Prenotazioni> prenotazionis;

	public Clienti() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Anagrafiche getAnagrafiche() {
		return this.anagrafiche;
	}

	public void setAnagrafiche(Anagrafiche anagrafiche) {
		this.anagrafiche = anagrafiche;
	}

	public List<Prenotazioni> getPrenotazionis() {
		return this.prenotazionis;
	}

	public void setPrenotazionis(List<Prenotazioni> prenotazionis) {
		this.prenotazionis = prenotazionis;
	}

	public Prenotazioni addPrenotazioni(Prenotazioni prenotazioni) {
		getPrenotazionis().add(prenotazioni);
		prenotazioni.setClienti(this);

		return prenotazioni;
	}

	public Prenotazioni removePrenotazioni(Prenotazioni prenotazioni) {
		getPrenotazionis().remove(prenotazioni);
		prenotazioni.setClienti(null);

		return prenotazioni;
	}

}