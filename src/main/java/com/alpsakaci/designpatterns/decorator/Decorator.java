package com.alpsakaci.designpatterns.decorator;

public class Decorator {

	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangele = new RedShapeDecorator(new Rectangle());

		circle.draw();
		redCircle.draw();
		redRectangele.draw();
	}

}
