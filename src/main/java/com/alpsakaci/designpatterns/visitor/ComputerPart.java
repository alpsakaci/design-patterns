package com.alpsakaci.designpatterns.visitor;

public interface ComputerPart {
	
	public void accept(ComputerPartVisitor computerPartVisitor);

}
