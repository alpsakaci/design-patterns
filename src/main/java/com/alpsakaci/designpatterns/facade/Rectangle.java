package com.alpsakaci.designpatterns.facade;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectange -> draw() invoked.");
	}

}
