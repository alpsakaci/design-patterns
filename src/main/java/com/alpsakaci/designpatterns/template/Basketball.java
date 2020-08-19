package com.alpsakaci.designpatterns.template;

public class Basketball extends Game {

	@Override
	void initialize() {
		System.out.println("Basketball initialized.");
	}

	@Override
	void startPlay() {
		System.out.println("Basketball started.");
	}

	@Override
	void endPlay() {
		System.out.println("Basketball finished.");
	}

}
