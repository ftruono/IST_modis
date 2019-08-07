package com.overnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overnet.model.TerapieModel;
import com.overnet.service.TerapieService;
import com.overnet.service.Service;

@RestController
@RequestMapping("terapie")
public class TerapieController extends AbstractController<TerapieModel> {

	@Autowired
	private TerapieService terapieService;

	@Override
	protected Service<TerapieModel> getService() {
		return terapieService;
	}
	
}