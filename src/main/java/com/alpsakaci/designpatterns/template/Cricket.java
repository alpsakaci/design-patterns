package com.alpsakaci.designpatterns.template;

public class Cricket extends Game {

	@Override
	void initialize() {
		System.out.println("Circket initialized.");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket started.");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket finished.");
	}

}
