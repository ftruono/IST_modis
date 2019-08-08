package com.overnet.esercitazione.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.overnet.esercitazione.entity.Medici;
import com.overnet.esercitazione.model.MediciModel;
import com.overnet.esercitazione.repository.MediciRepository;
import com.overnet.esercitazione.repository.Repository;

@Service
public class MediciServiceImpl extends AbstractService<MediciModel, Medici> implements MediciService {

	@Autowired
	private MediciRepository medRepository;

	@Override
	protected Repository<Medici> getRepository() {
		return medRepository;
	}

	@Override
	protected MediciModel converterEntityToModel(Medici entity) {
		MediciModel model = new MediciModel();
		if (entity != null) {
			model.setId(entity.getId());
			model.setIsMedico(entity.getIsmedico());
		}
		return model;
	}

	@Override
	protected Medici converterModelToEntity(MediciModel model) {
		Medici entity = new Medici();
		if (entity != null) {
			//entity.setId(model.getId());
			entity.setIsmedico(model.getIsMedico());
		}
		return entity;
	}

	@Override
	protected MediciModel preCreate(MediciModel model) {
		return model;
	}


}
