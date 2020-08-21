package com.alpsakaci.designpatterns.interceptingfilter;

public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Debug: " + request);
	}

}
