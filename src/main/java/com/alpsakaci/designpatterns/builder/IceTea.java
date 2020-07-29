package com.alpsakaci.designpatterns.builder;

public class IceTea extends ColdDrink {

	@Override
	public String name() {
		return "IceTea";
	}

	@Override
	public float price() {
		return 7.5f;
	}

}
