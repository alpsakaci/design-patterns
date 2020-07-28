package com.alpsakaci.designpatterns.factorypattern;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square -> draw() invoked.");
	}

}
