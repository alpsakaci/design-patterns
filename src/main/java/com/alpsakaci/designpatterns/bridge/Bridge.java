package com.alpsakaci.designpatterns.bridge;

public class Bridge {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(), 15, 3, 8);
		Shape greenCircle = new Circle(new GreenCircle(), 50, -30, -20);

		redCircle.draw();
		greenCircle.draw();
	}

}
