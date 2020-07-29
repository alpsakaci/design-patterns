package com.alpsakaci.designpatterns.prototype;

public class Circle extends Shape {
	
	public Circle() {
		this.setType("Circle");
	}

	@Override
	void draw() {
		System.out.println("Circle -> draw() invoked.");
	}
}
