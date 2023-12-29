package com.structural.facade.design.pattern.impl;

public class StationaryFactory {

	public static Stationary createStationary() {
		return new HalloweenStationary();
	}

}
