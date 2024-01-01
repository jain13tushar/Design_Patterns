package com.behavioral.state.design.pattern.impl;

public class Cancelled implements OrderState {

	@Override
	public double handleCancellation() {
		throw new IllegalArgumentException("Cancelled order. Can't cancel anymore");
	}

}
