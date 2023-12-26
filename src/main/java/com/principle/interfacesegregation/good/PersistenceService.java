package com.principle.interfacesegregation.good;

public interface PersistenceService<T extends Entity> {

	public void save(T entity);

	public void delete(T entity);

	public T findById(Long id);

}
