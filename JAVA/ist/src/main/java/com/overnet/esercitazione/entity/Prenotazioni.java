package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PRENOTAZIONI database table.
 * 
 */
@Entity
@NamedQuery(name="Prenotazioni.findAll", query="SELECT p FROM Prenotazioni p")
public class Prenotazioni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRENOTAZIONI_ID_GENERATOR", sequenceName="SEQ_PRENOTAZIONI")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRENOTAZIONI_ID_GENERATOR")
	private long id;

	private BigDecimal attivo;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_ORA")
	private Date dataOra;

	private String patologia;

	//bi-directional many-to-one association to Ambulatori
	@ManyToOne
	@JoinColumn(name="ID_AMBULATORIO")
	private Ambulatori ambulatori;

	//bi-directional many-to-one association to Clienti
	@ManyToOne
	@JoinColumn(name="ID_CLIENTE")
	private Clienti clienti;

	public Prenotazioni() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getAttivo() {
		return this.attivo;
	}

	public void setAttivo(BigDecimal attivo) {
		this.attivo = attivo;
	}

	public Date getDataOra() {
		return this.dataOra;
	}

	public void setDataOra(Date dataOra) {
		this.dataOra = dataOra;
	}

	public String getPatologia() {
		return this.patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}

	public Ambulatori getAmbulatori() {
		return this.ambulatori;
	}

	public void setAmbulatori(Ambulatori ambulatori) {
		this.ambulatori = ambulatori;
	}

	public Clienti getClienti() {
		return this.clienti;
	}

	public void setClienti(Clienti clienti) {
		this.clienti = clienti;
	}

}