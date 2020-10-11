package com.alpsakaci.designpatterns.servicelocator;

// JNDI Lookup
public class InitialContext {

	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("SERVICE 1")) {
			System.out.println("Looking up and creating Service 1");
			return new Service1();
		} else if (jndiName.equalsIgnoreCase("SERVICE 2")) {
			System.out.println("Looking up and creating Service 2");
			return new Service2();
		}

		return null;
	}

}
