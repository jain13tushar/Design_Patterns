package com.structural.adapterobject.design.pattern.impl;

/**
 * A class adapter, works as Two-way adapter.
 * 
 * @author tushar
 *
 */
public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullName();
	}

	@Override
	public String getDesignation() {
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		return this.getOfficeLocation();
	}

}
