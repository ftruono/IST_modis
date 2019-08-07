package com.overnet.esercitazione.service;

import java.util.ArrayList;
import java.util.List;

import com.overnet.esercitazione.repository.Repository;

public abstract class AbstractService<M, E> {

	protected abstract Repository<E> getRepository();
	protected abstract M converterEntityToModel(E entity);
	protected abstract E converterModelToEntity(M model);
	protected abstract M preCreate(M model);

	public void create(M model) {
		M modelPreCreate = this.preCreate(model);
		E entity = this.converterModelToEntity(modelPreCreate);
		getRepository().create(entity);
	}

	public void edit(M model) {
		E entity = this.converterModelToEntity(model);
		getRepository().edit(entity);
	}

	public void remove(M model) {
		E entity = this.converterModelToEntity(model);
		getRepository().remove(entity);
	}

	public M find(Long id) {
		E entity = getRepository().find(id);
		M model = this.converterEntityToModel(entity);
		return model;
	}

	public List<M> findAll() {
		List<E> entityList = getRepository().findAll();
		List<M> modelList = this.converterEntityListToModelList(entityList);
		return modelList;
	}

	public List<M> findRange(int[] is) {
		List<E> entityList = getRepository().findRange(is);
		List<M> modelList = this.converterEntityListToModelList(entityList);
		return modelList;
	}

	public Integer count() {
		return getRepository().count();
	}


	protected List<M> converterEntityListToModelList(List<E> entityList) {
		List<M> modelList = new ArrayList<M>();
		if (entityList != null) {
			for (E entity : entityList) {
				M model = this.converterEntityToModel(entity);
				modelList.add(model);
			}
		}
		return modelList;
	}

	private List<E> converterModelListToEntityList(List<M> modelList) {
		List<E> entityList = new ArrayList<E>();
		if (modelList != null) {
			for (M model : modelList) {
				E entity = this.converterModelToEntity(model);
				entityList.add(entity);
			}
		}
		return entityList;
	}

}
