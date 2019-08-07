package com.overnet.esercitazione.repository;

import java.util.List;
import com.overnet.esercitazione.entity.Anagrafiche;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractRepository<E> {
	
	private Class<E> entityClass;

    public AbstractRepository(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
	
	@PersistenceContext(name = "ist")
	protected EntityManager em;

	public void create(E entity) {
//		((Anagrafiche)entity).setId(19);
//		System.out.println(entity.toString());
		em.persist(entity);
	}

	public void edit(E entity) {
		em.merge(entity);
	}

	public E find(Long id) {
		return em.find(entityClass, id);
	}

	public void remove(E entity) {
		em.remove(em.merge(entity));
	}

	public List<E> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
	}

	public List<E> findRange(int[] is) {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = em.createQuery(cq);
        q.setMaxResults(is[1] - is[0] + 1);
        q.setFirstResult(is[0]);
        return q.getResultList();
	}

	public Integer count() {
        javax.persistence.criteria.CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<E> rt = cq.from(entityClass);
        cq.select(em.getCriteriaBuilder().count(rt));
        javax.persistence.Query q = em.createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
	}

}
