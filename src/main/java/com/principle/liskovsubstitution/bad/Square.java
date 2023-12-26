package com.principle.liskovsubstitution.bad;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setWidth(int width) {
		setWidth(width);
	}

	@Override
	public void setHeight(int height) {
		setHeight(height);
	}

	public void setSide(int side) {
		super.setWidth(side);
		super.setHeight(side);
	}

}
