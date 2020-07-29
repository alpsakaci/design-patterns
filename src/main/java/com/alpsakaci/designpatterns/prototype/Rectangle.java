package com.alpsakaci.designpatterns.prototype;

public class Rectangle extends Shape {
	
	public Rectangle() {
		this.setType("Rectangle");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle -> draw() invoked.");
	}
}
