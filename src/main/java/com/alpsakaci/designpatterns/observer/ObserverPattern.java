package com.alpsakaci.designpatterns.observer;


public class ObserverPattern {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);
		
		System.out.println("First state: 21");
		subject.setState(21);
		System.out.println("State change: 10");
		subject.setState(10);
	}

}
