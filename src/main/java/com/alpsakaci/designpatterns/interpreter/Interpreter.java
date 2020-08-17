package com.alpsakaci.designpatterns.interpreter;

public class Interpreter {

//	Rule: Alp and Bugra are male.
	public static Expression getMaleExpression() {
		Expression alp = new TerminalExpression("Alp");
		Expression bugra = new TerminalExpression("Bugra");
		return new OrExpression(alp, bugra);
	}
	
	public static Expression getMarriedWomanExpression() {
		Expression selin = new TerminalExpression("Selin");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(selin, married);
	}

	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		
		System.out.println("isMale? " + isMale.interpret("Alp"));
		System.out.println("isMarriedWoman? " + isMarriedWoman.interpret("Selin Married"));
	}

}
