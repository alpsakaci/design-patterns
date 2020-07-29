package com.alpsakaci.designpatterns.factory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("rectangle")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}
		
		return null;
	}

}
