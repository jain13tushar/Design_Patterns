package com.principle.interfacesegregation.bad;

import java.time.LocalDateTime;

public class Order extends Entity {

	private LocalDateTime orderPlacedOn;

	private double totalValue;

	public LocalDateTime getOrderPlacedOn() {
		return orderPlacedOn;
	}

	public void setOrderPlacedOn(LocalDateTime orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

}
