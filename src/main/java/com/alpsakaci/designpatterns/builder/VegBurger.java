package com.alpsakaci.designpatterns.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 30.5f;
	}

}
