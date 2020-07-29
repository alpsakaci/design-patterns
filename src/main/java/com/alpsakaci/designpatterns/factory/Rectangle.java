package com.alpsakaci.designpatterns.factory;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle -> draw() invoked.");
	}

}
