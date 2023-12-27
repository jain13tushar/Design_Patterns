package com.structural.adapterobject.design.pattern.impl;

/**
 * Client code which requires Customer interface.
 * 
 * @author tushar
 *
 */
public class BusinessCardDesigner {

	public String designCard(Customer customer) {
		String card = "";
		card += customer.getName();
		card += "\n" + customer.getDesignation();
		card += "\n" + customer.getAddress();
		return card;
	}

}
