package com.overnet.esercitazione.service;

import java.util.List;
import com.overnet.esercitazione.model.TerapieModel;

public interface TerapieService extends Service<TerapieModel> {
	public List<TerapieModel> getTerapieFromAmbulatorioId(long id);
}
