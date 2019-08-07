package com.overnet.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.overnet.entity.Terapie;
import com.overnet.model.TerapieModel;
import com.overnet.repository.TerapieRepository;
import com.overnet.repository.Repository;

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
            model.setNome(entity.getNome());
            model.setCod(entity.getCod());
		}
		return model;
	}

	@Override
	protected Terapie converterModelToEntity(TerapieModel model) {
		Terapie entity = new Terapie();
		if (entity != null) {
			entity.setId(model.getId());
            entity.setNome(model.getNome());
            entity.setCod(model.getCod());
		}
		return entity;
	}

	@Override
	protected TerapieModel preCreate(TerapieModel model) {
		model.setId(0);
        model.setNome("");
        model.setCod("");
		return model;
	}

}
