package com.overnet.esercitazione.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.overnet.esercitazione.model.AnagraficheModel;
import com.overnet.esercitazione.model.TerapieModel;
import com.overnet.esercitazione.service.AnagraficheService;
import com.overnet.esercitazione.service.Service;
import com.overnet.esercitazione.service.TerapieService;

@RestController
@RequestMapping("Terapie")
public class TerapieController extends AbstractController<TerapieModel> {

	
	@Autowired
	 private TerapieService terapieService;
	
	@Override
	protected Service<TerapieModel> getService() {
		return terapieService;
	}
	// TODO:: RANGE AMBULATORI
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET , value = "/Ambulatori/{id}")
    @ResponseBody
//	@RequestMapping(value="{id}",method = RequestMethod.GET)
	protected List<TerapieModel> getListByIdAmbulatorio(@PathVariable Long id){
		return terapieService.getTerapieFromAmbulatorioId(id);
	}
	
    @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET , value = "/Medici/{id}")
    @ResponseBody
//	@RequestMapping(value="{id}",method = RequestMethod.GET)
	protected List<TerapieModel> getListByIdMedico(@PathVariable Long id){
		return terapieService.getTerapieFromMedicoId(id);
	}
   
	
}
