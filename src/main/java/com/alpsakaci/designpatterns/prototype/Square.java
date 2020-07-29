package com.alpsakaci.designpatterns.prototype;

public class Square extends Shape {
	
	public Square() {
		this.setType("Square");
	}

	@Override
	void draw() {
		System.out.println("Square -> draw() invoked.");
	}
}
