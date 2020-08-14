package com.alpsakaci.designpatterns.command;

public class Stock {

	private String name = "ACME";
	private int quantity = 4;
	
	public void buy() {
		System.out.println("Stock [Name: " + name + 
				" Quantity: " + quantity + " ] bought.");
	}
	
	public void sell() {
		System.out.println("Stock [Name: " + name + 
				" Quantity: " + quantity + " ] sold.");
	}
}
