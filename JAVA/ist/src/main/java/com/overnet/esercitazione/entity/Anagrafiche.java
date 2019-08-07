package com.overnet.esercitazione.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ANAGRAFICHE database table.
 * 
 */
@Entity
@NamedQuery(name="Anagrafiche.findAll", query="SELECT a FROM Anagrafiche a")
public class Anagrafiche implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ANAGRAFICHE_ID_GENERATOR", sequenceName="SEQ_ANAGRAFICHE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ANAGRAFICHE_ID_GENERATOR")
	private long id;

	private String cf;

	private String cognome;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASCITA")
	private Date dataNascita;

	@Column(name="N_CELLULARE")
	private String nCellulare;

	private String nome;

	//bi-directional many-to-one association to Clienti
	@OneToMany(mappedBy="anagrafiche")
	private List<Clienti> clientis;

	//bi-directional many-to-one association to Medici
	@OneToMany(mappedBy="anagrafiche")
	private List<Medici> medicis;

	//bi-directional many-to-one association to Staff
	@OneToMany(mappedBy="anagrafiche")
	private List<Staff> staffs;

	public Anagrafiche() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCf() {
		return this.cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDataNascita() {
		return this.dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getNCellulare() {
		return this.nCellulare;
	}

	public void setNCellulare(String nCellulare) {
		this.nCellulare = nCellulare;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Clienti> getClientis() {
		return this.clientis;
	}

	public void setClientis(List<Clienti> clientis) {
		this.clientis = clientis;
	}

	public Clienti addClienti(Clienti clienti) {
		getClientis().add(clienti);
		clienti.setAnagrafiche(this);

		return clienti;
	}

	public Clienti removeClienti(Clienti clienti) {
		getClientis().remove(clienti);
		clienti.setAnagrafiche(null);

		return clienti;
	}

	public List<Medici> getMedicis() {
		return this.medicis;
	}

	public void setMedicis(List<Medici> medicis) {
		this.medicis = medicis;
	}

	public Medici addMedici(Medici medici) {
		getMedicis().add(medici);
		medici.setAnagrafiche(this);

		return medici;
	}

	public Medici removeMedici(Medici medici) {
		getMedicis().remove(medici);
		medici.setAnagrafiche(null);

		return medici;
	}

	public List<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

	public Staff addStaff(Staff staff) {
		getStaffs().add(staff);
		staff.setAnagrafiche(this);

		return staff;
	}

	public Staff removeStaff(Staff staff) {
		getStaffs().remove(staff);
		staff.setAnagrafiche(null);

		return staff;
	}

}