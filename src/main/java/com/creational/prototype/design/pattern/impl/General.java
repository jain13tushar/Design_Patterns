package com.creational.prototype.design.pattern.impl;

//Doesn't support cloaning
public class General extends GameUnit {

	private String state = "idle";

	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public String toString() {
		return "General " + state + " @ " + getPosition();
	}

	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("reset not supported");
	}

}
