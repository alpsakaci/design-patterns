package com.alpsakaci.designpatterns.factory;

public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("RoundedRectangle -> draw() invoked.");
	}

}
