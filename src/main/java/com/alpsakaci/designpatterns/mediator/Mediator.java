package com.alpsakaci.designpatterns.mediator;

public class Mediator {

	public static void main(String[] args) {
		User alp = new User("Alp");
		User burak = new User("Burak");
		
		alp.sendMessage("Hi!");
		burak.sendMessage("Hello");
	}

}
