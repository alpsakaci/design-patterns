package com.alpsakaci.designpatterns.factory;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle -> draw() invoked.");
	}

}
