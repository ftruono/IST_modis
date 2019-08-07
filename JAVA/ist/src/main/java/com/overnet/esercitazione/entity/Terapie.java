package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TERAPIE database table.
 * 
 */
@Entity
@NamedQuery(name="Terapie.findAll", query="SELECT t FROM Terapie t")
public class Terapie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TERAPIE_ID_GENERATOR", sequenceName="SEQ_TERAPIE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TERAPIE_ID_GENERATOR")
	private long id;

	private String cod;

	private String nome;

	//bi-directional many-to-many association to Medici
	@ManyToMany(mappedBy="terapies")
	private List<Medici> medicis;

	//bi-directional many-to-many association to Ambulatori
	@ManyToMany
	@JoinTable(
		name="TERAPIE_AMBULATORI"
		, joinColumns={
			@JoinColumn(name="ID_TERAPIA")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_AMBULATORIO")
			}
		)
	private List<Ambulatori> ambulatoris;

	public Terapie() {
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

	public List<Medici> getMedicis() {
		return this.medicis;
	}

	public void setMedicis(List<Medici> medicis) {
		this.medicis = medicis;
	}

	public List<Ambulatori> getAmbulatoris() {
		return this.ambulatoris;
	}

	public void setAmbulatoris(List<Ambulatori> ambulatoris) {
		this.ambulatoris = ambulatoris;
	}

}