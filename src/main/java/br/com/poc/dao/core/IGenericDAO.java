package br.com.poc.dao.core;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

public interface IGenericDAO <T, I extends Serializable>{
	 public T save(T entity);
	  
	 public void remove(T entity);
	  
	 public T getById(Class<T> classe, I pk);
	  
	 public List<T> getAll(Class<T> classe);
	  
	 public EntityManager getEntityManager();
}
