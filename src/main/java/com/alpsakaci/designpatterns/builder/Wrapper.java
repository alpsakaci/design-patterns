package com.alpsakaci.designpatterns.builder;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper " + this.hashCode();
	}

}
