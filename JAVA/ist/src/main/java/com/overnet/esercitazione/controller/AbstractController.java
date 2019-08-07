package com.overnet.esercitazione.controller;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.overnet.service.Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class AbstractController<E> {
	
	protected abstract Service<E> getService();

	@Transactional
	@PostMapping(value = "")
	public void create(@RequestBody E entity) {
		getService().create(entity);
	}
	
	@Transactional
	@PutMapping("")
	public void edit(@RequestBody E entity) {
		getService().edit(entity);
	}

	@Transactional()
	@DeleteMapping("{id}")
	public void remove(@PathVariable Integer id) {
		getService().remove(getService().find(id));
	}

	@Transactional(readOnly = true)
	@GetMapping("{id}")
	public E find(@PathVariable Integer id) {
		return (E) getService().find(id);
	}

        
        /*
	@Transactional(readOnly = true)
	@GetMapping("")
        */
        @RequestMapping(
            produces = MediaType.APPLICATION_JSON_VALUE, 
            //MediaType.APPLICATION_JSON_VALUE  APPLICATION_XML_VALUE
            method = RequestMethod.GET /*, value = "/foo/bar"*/
        )
        @ResponseBody
	public List<E> findAll() {
		List<E> clienteList = getService().findAll();
		return clienteList;
	}

	@Transactional(readOnly = true)
	@GetMapping("{from}/{to}")
	public List<E> findRange(@PathVariable Integer from, @PathVariable Integer to) {
		return getService().findRange(new int[] { from, to });
	}

	@Transactional(readOnly = true)
	@GetMapping("count")
	public Integer countREST() {
		return getService().count();
	}

}
