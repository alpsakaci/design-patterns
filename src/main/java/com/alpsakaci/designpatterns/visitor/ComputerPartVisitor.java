package com.alpsakaci.designpatterns.visitor;

public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);

	public void visit(Mouse mouse);

}
