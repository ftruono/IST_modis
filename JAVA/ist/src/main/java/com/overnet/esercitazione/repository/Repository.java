package com.overnet.esercitazione.repository;

import java.util.List;


public interface Repository<E> {
	
	void create(E entity);

	void edit(E entity);

	E find(Long id);

	void remove(E find);

	List<E> findAll();

	List<E> findRange(int[] is);

	Integer count();

}
