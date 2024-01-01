package com.behavioral.state.design.pattern.impl;

public class New implements OrderState {

	@Override
	public double handleCancellation() {
		System.out.println("It's a new Order. No processing done");
		return 0;
	}

}
