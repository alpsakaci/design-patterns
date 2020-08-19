package com.alpsakaci.designpatterns.template;

public class TemplatePattern {

	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		
		game = new Basketball();
		game.play();
	}

}
