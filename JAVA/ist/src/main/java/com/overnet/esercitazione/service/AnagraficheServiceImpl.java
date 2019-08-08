package com.overnet.esercitazione.service;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
//		if(model == null)
//			System.out.println("SONO NULL!!");
		if ( checkCf(model.getCf()) )
			return model;
		// TODO:: GESTIONE NULL
		else return null;
	}
	
	private static boolean checkCf(String cf) {
		cf.toUpperCase();		
		Pattern p = Pattern.compile("[A-Z]{6}[0-9]{2}[ABCDEHLMPRST]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Za-z]{1}");
		Matcher m = p.matcher(cf);
		return m.matches();
	}

}
