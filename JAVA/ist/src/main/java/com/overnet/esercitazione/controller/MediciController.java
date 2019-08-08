package com.overnet.esercitazione.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overnet.esercitazione.model.MediciModel;
import com.overnet.esercitazione.service.MediciService;
import com.overnet.esercitazione.service.Service;

@RestController
@RequestMapping("Medici")
public class MediciController extends AbstractController<MediciModel>{

	@Autowired
	private MediciService mediciService;
	
	@Override
	protected Service<MediciModel> getService() {
		return mediciService;
	}

}
