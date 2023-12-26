package com.principle.liskovsubstitution.good;

public class GoodClientLiskovSubstitution {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());

		Square square = new Square(10);
		System.out.println(square.computeArea());

		useRectange(rectangle);

	}

	private static void useRectange(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
	}

}
