package com.overnet.esercitazione.repository;

import org.springframework.stereotype.Repository;

import com.overnet.esercitazione.entity.Medici;

@Repository
public class MediciRepositoryImpl extends AbstractRepository<Medici> implements MediciRepository {

	public MediciRepositoryImpl() {
		super(Medici.class);
	}

}
