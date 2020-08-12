package com.alpsakaci.designpatterns.flyweight;

public class Flyweight {
	private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			Circle circle = (Circle)ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(50);
			circle.draw();
		}
	}

	private static int getRandomY() {
		return (int)(Math.random()*100);
	}

	private static int getRandomX() {
		return (int)(Math.random()*100);
	}

	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
	}

}
