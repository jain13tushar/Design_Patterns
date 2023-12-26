package com.principle.interfacesegregation.bad;

import java.util.List;

// If there is no use of the method implementation 
// then remove the method and implement it,
// in the implementation class itself.
public interface PersistenceService<T extends Entity> {

	public void save(T entity);

	public void delete(T entity);

	public T findById(Long id);

	public List<T> findByName(String name);

}
