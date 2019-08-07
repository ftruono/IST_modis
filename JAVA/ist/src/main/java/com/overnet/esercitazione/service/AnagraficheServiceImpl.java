package com.overnet.esercitazione.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.overnet.esercitazione.entity.Anagrafiche;
import com.overnet.esercitazione.model.AnagraficheModel;
import com.overnet.esercitazione.repository.AnagraficheRepository;
import com.overnet.esercitazione.repository.Repository;

@Service
public class AnagraficheServiceImpl extends AbstractService<AnagraficheModel, Anagrafiche> implements AnagraficheService {

	@Autowired
	private AnagraficheRepository anaRepository;

	@Override
	protected Repository<Anagrafiche> getRepository() {
		return anaRepository;
	}

	@Override
	protected AnagraficheModel converterEntityToModel(Anagrafiche entity) {
		AnagraficheModel model = new AnagraficheModel();
		if (entity != null) {
			model.setId(entity.getId());
			model.setCognome(entity.getCognome());
			model.setNome(entity.getNome());
			model.setDataNascita(entity.getDataNascita());
			model.setCf(entity.getCf());
			model.setnCellulare(entity.getNCellulare());
		}
		return model;
	}

	@Override
	protected Anagrafiche converterModelToEntity(AnagraficheModel model) {
		Anagrafiche entity = new Anagrafiche();
		if (entity != null) {
			//entity.setId(model.getId());
			entity.setCognome(model.getCognome());
			entity.setNome(model.getNome());
			entity.setDataNascita(model.getDataNascita());
			entity.setCf(model.getCf());
			entity.setNCellulare(model.getnCellulare());
		}
		return entity;
	}

	@Override
	protected AnagraficheModel preCreate(AnagraficheModel model) {
		if(model == null)
			System.out.println("SONO NULL!!");
		/*
		model.setId(new Long(0));
		model.setCognome(new String());
		model.setNome(new String());
		model.setDataNascita(new Date());
		model.setCf(new String());
		model.setnCellulare(new String());*/
		return model;
	}

}
