package com.alpsakaci.designpatterns.singleton;

public class SingleObject {
	private static SingleObject instance = new SingleObject();

	private SingleObject() {}

	public static SingleObject getInstance() {
		return instance;
	}

	public void printHashCode() {
		System.out.println(this.hashCode());
	}
}
