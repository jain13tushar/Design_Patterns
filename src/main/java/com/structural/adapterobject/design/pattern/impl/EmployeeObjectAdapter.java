package com.structural.adapterobject.design.pattern.impl;

/**
 * An object adapter. Using composition to translate interface
 * 
 * @author tushar
 *
 */
public class EmployeeObjectAdapter implements Customer {

	private Employee adaptee;

	public EmployeeObjectAdapter(com.structural.adapterobject.design.pattern.impl.Employee employee) {
		this.adaptee = employee;
	}

	@Override
	public String getName() {
		return adaptee.getFullName();
	}

	@Override
	public String getDesignation() {
		return adaptee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return adaptee.getOfficeLocation();
	}

}
