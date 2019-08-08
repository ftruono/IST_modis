package com.overnet.esercitazione.repository;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.overnet.esercitazione.entity.Terapie;

@Repository
public class TerapieRepositoryImpl extends AbstractRepository<Terapie> implements TerapieRepository {

	public TerapieRepositoryImpl() {
		super(Terapie.class);
	}

	@Override
	public List<Terapie> getTerapieFromAmbulatorioId(long id) {
		return this.em.createNamedQuery("Terapie.findByAmbulatori",Terapie.class).setParameter("idAmbulatorio",id).getResultList();
	}

	@Override
	public List<Terapie> getTerapieFromMedicoId(long id) {
		return this.em.createNamedQuery("Terapie.findByMedici",Terapie.class).setParameter("idMedico",id).getResultList();
	}
}
