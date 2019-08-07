package com.overnet.esercitazione.repository;

import java.util.List;

import com.overnet.esercitazione.entity.Medici;
import com.overnet.esercitazione.entity.Terapie;

public interface TerapieRepository extends Repository<Terapie> {
   public List<Terapie> getTerapieFromAmbulatorioId(long id);
   
   
}
