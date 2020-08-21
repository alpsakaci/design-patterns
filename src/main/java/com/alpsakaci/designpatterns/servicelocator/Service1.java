package com.alpsakaci.designpatterns.servicelocator;

public class Service1 implements Service {

	@Override
	public String getName() {
		return "Service 1";
	}

	@Override
	public void execute() {
		System.out.println("Service 1 is running.");
	}

}
