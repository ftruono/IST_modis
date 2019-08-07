package com.overnet.esercitazione.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.overnet.esercitazione.model.AnagraficheModel;
import com.overnet.esercitazione.service.AnagraficheService;
import com.overnet.esercitazione.service.Service;

@RestController
@RequestMapping("Anagrafiche")
public class AnagraficheController extends AbstractController<AnagraficheModel> {

 @Autowired
 private AnagraficheService anagraficheService;

 @Override
 protected Service<AnagraficheModel> getService() {
  return anagraficheService;
 }
 
}
