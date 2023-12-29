package com.structural.proxy.design.pattern.impl;

import javafx.geometry.Point2D;

//Our concrete class providing actual functionality
public class BitmapImage implements Image {

	private Point2D location;

	private String name;

	public BitmapImage(String filename) {
		System.out.println("Loaded from disk : " + filename);
		name = filename;
	}

	@Override
	public void setLocation(Point2D point2d) {
		location = point2d;
	}

	@Override
	public Point2D getLocation() {
		return location;
	}

	@Override
	public void render() {
		// render to screen
		System.out.println("Rendered " + this.name);
	}

}
