package com.overnet.esercitazione.service;

import java.util.List;

public interface Service<M> {
	
	void create(M entity);

	void edit(M entity);

	M find(Long id);

	void remove(M find);

	List<M> findAll();

	List<M> findRange(int[] is);

	Integer count();
	
}
