package com.structural.proxy.design.pattern.dynamic.impl;

import javafx.geometry.Point2D;

public class ClientDynamicProxy {

	public static void main(String[] args) {

		Image img = ImageFactory.getImage("A.bmp");
		img.setLocation(new Point2D(-10, 0));
		System.out.println(img.getLocation());
		System.out.println("***********");
		img.render();
	}

}
