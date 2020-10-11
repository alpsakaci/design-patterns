package com.alpsakaci.designpatterns.adapter;

public class Adapter {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "Midlake - Core of the Nature.mp3");
		audioPlayer.play("mp4", "Wild is the wind.mp4");
		audioPlayer.play("vlc", "The Imitation Game.vlc");
		audioPlayer.play("avi", "Good Will Hunting.avi");
	}

}
