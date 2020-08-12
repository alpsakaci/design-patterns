package com.alpsakaci.designpatterns.proxy;

public class Proxy {

	public static void main(String[] args) {
		Image image = new ProxyImage("test-image.jpg");

//		Image will be loaded from disk.
		image.display();
		
//		Image will not be loaded from disk.
		image.display();
	}
}
