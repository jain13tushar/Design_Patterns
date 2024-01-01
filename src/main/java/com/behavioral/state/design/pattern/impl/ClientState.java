package com.behavioral.state.design.pattern.impl;

public class ClientState {

	public static void main(String[] args) {

		Order order = new Order();

		order.paymentSuccessful();
		order.dispatched();
		order.cancel();

	}

}
