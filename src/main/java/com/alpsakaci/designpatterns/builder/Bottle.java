package com.alpsakaci.designpatterns.builder;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle " + this.hashCode();
	}

}
