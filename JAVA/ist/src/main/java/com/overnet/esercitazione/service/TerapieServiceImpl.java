package com.overnet.esercitazione.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.overnet.esercitazione.entity.Anagrafiche;
import com.overnet.esercitazione.entity.Terapie;
import com.overnet.esercitazione.model.AnagraficheModel;
import com.overnet.esercitazione.model.TerapieModel;
import com.overnet.esercitazione.repository.AbstractRepository;
import com.overnet.esercitazione.repository.AnagraficheRepository;
import com.overnet.esercitazione.repository.Repository;
import com.overnet.esercitazione.repository.TerapieRepository;

@Service
public class TerapieServiceImpl extends AbstractService<TerapieModel, Terapie> implements TerapieService {

	@Autowired
	private TerapieRepository terapieRepository;

	@Override
	protected Repository<Terapie> getRepository() {
		return terapieRepository;
	}

	@Override
	protected TerapieModel converterEntityToModel(Terapie entity) {
		TerapieModel model = new TerapieModel();
		if (entity != null) {
			model.setId(entity.getId());
			model.setCod(entity.getCod());
			model.setNome(entity.getNome());
		}
		return model;
	}

	@Override
	protected Terapie converterModelToEntity(TerapieModel model) {
		Terapie entity = new Terapie();
		if (entity != null) {
			entity.setAmbulatoris(null);
			entity.setCod(model.getCod());
			//entity.setId(model.getId());
			entity.setMedicis(null);
			entity.setNome(model.getNome());
		}
		return entity;
	}

	@Override
	protected TerapieModel preCreate(TerapieModel model) {
		return model;
	}

	@Override
	public List<TerapieModel> getTerapieFromAmbulatorioId(long id) {
		return super.converterEntityListToModelList(terapieRepository.getTerapieFromAmbulatorioId(id));
	}

	

}
