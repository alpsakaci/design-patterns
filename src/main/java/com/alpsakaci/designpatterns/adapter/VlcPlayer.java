package com.alpsakaci.designpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void play(String fileName) {
		System.out.println("Playing from Vlc player. File: " + fileName);
	}

}
