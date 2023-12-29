package com.structural.proxy.design.pattern.impl;

import javafx.geometry.Point2D;

public class ClientProxy {

	public static void main(String[] args) {

		Image img = ImageFactory.getImage("A1.bmp");
		img.setLocation(new Point2D(10, 10));

		System.out.println("Image location : " + img.getLocation());
		System.out.println("Rendering image now.....");
		img.render();

	}

}
