package com.alpsakaci.designpatterns.strategy;

public class StrategyPattern {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(12, 4));
		
		context.setStrategy(new OperationSubstract());
		System.out.println(context.executeStrategy(12, 4));
		
		context.setStrategy(new OperationMultiply());
		System.out.println(context.executeStrategy(12, 4));
	}

}
