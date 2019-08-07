package com.overnet.repository;

import org.springframework.stereotype.Repository;

import com.overnet.entity.Terapie;

@Repository
public class TerapieRepositoryImpl extends AbstractRepository<Terapie> implements TerapieRepository {

	public TerapieRepositoryImpl() {
		super(Terapie.class);
	}

}
