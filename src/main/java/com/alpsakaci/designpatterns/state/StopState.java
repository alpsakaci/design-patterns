package com.alpsakaci.designpatterns.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in Stop State");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "StopState [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
