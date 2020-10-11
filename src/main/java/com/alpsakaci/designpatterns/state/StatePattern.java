package com.alpsakaci.designpatterns.state;

public class StatePattern {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		StopState stopState = new StopState();

		startState.doAction(context);
		System.out.println(context.getState());

		stopState.doAction(context);
		System.out.println(context.getState());
	}

}
