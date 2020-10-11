package com.alpsakaci.designpatterns.factory;

public class FactoryPattern {
	public static void main(String[] args) {
//		ShapeFactory shapeFactory = new ShapeFactory();
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();

		Shape shape4 = shapeFactory1.getShape("rectangle");
		shape4.draw();

		Shape shape5 = shapeFactory1.getShape("square");
		shape5.draw();
	}
}
