package com.overnet.esercitazione.repository;

import java.util.List;

import com.overnet.esercitazione.entity.Terapie;


public class TerapieRepositoryImpl extends AbstractRepository<Terapie> implements TerapieRepository {

	public TerapieRepositoryImpl(Class<Terapie> entityClass) {
		super(entityClass);
	}

	@Override
	public List<Terapie> getTerapieFromAmbulatorioId(long id) {
		return this.em.createNamedQuery("Terapie.findByAmbulatori",Terapie.class).setParameter(":nomeAmbulatorio",id).getResultList();
	}

}
