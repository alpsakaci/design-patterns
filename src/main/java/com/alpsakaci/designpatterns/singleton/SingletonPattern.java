package com.alpsakaci.designpatterns.singleton;

public class SingletonPattern {
	
	public static void main(String[] args) {
		SingleObject object  = SingleObject.getInstance();
		object.printHashCode();
		
		SingleObject object1 = SingleObject.getInstance();
		object1.printHashCode();
		
	}

}
