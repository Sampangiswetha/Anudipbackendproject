package com.coffeeshoporderingsystem.dao;
	import java.io.Serializable;
	import java.util.List;

	public interface GenericDAO<T, PK extends Serializable> {
	    T getById(PK id);
	    List<T> getAll();
	    void save(T entity);
	    void update(T entity);
	    void delete(T entity);
	}
