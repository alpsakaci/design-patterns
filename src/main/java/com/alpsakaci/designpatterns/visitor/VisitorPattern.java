package com.alpsakaci.designpatterns.visitor;

public class VisitorPattern {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
