package com.overnet.esercitazione.repository;

import org.springframework.stereotype.Repository;

import com.overnet.esercitazione.entity.Anagrafiche;

@Repository
public class AnagraficheRepositoryImpl extends AbstractRepository<Anagrafiche> implements AnagraficheRepository {

	public AnagraficheRepositoryImpl() {
		super(Anagrafiche.class);
	}

}
