package com.principle.singleresponsibility.good;

public class UserPersistanceService {

	private Store store = new Store();

	public void saveUser(User user) {
		store.store(user);
	}

}
