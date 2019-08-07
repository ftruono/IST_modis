package com.overnet.esercitazione.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overnet.esercitazione.Anagrafiche;
import com.overnet.esercitazione.AnagraficheService;
import com.overnet.esercitazione.service.Service;

@RestController
@RequestMapping("Anagrafiche")
public class AnagraficheController extends AbstractController<Anagrafiche> {

	@Autowired
	private AnagraficheService AnagraficheService;

	@Override
	protected Service<Anagrafiche> getService() {
		return AnagraficheService;
	}
	
}
