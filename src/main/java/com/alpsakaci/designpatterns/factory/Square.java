package com.alpsakaci.designpatterns.factory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square -> draw() invoked.");
	}

}
