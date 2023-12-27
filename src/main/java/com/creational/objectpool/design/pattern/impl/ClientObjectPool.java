package com.creational.objectpool.design.pattern.impl;

import javafx.geometry.Point2D;

public class ClientObjectPool {

	public static final ObjectPool<Bitmap> bitMapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

	public static void main(String[] args) {
		Bitmap b1 = bitMapPool.get();
		b1.setLocation(new Point2D(10, 10));
		Bitmap b2 = bitMapPool.get();
		b2.setLocation(new Point2D(-10, 0));

		b1.draw();
		b2.draw();

		bitMapPool.release(b1);
		bitMapPool.release(b2);
	}

}
