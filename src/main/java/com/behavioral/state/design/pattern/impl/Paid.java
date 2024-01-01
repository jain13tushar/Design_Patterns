package com.behavioral.state.design.pattern.impl;

public class Paid implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("Contacting payment gateway to rollback transaction");
		return 10;
	}

}
