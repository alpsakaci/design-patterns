package com.alpsakaci.designpatterns.factorypattern;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("RoundedRectangle -> draw() invoked.");
	}

}
