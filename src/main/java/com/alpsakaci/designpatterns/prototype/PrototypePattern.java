package com.alpsakaci.designpatterns.prototype;

public class PrototypePattern {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.print("Shape: " + clonedShape.getType());
		System.out.println(", Hash Code: " + clonedShape.hashCode());
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("2");
		System.out.print("Shape: " + clonedShape1.getType());
		System.out.println(", Hash Code: " + clonedShape1.hashCode());
		

		Shape clonedShape2 = (Shape) ShapeCache.getShape("3");
		System.out.print("Shape: " + clonedShape2.getType());
		System.out.println(", Hash Code: " + clonedShape2.hashCode());
	}

}
