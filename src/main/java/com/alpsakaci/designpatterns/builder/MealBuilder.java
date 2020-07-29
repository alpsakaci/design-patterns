package com.alpsakaci.designpatterns.builder;

public class MealBuilder {

	Meal meal;

	public MealBuilder() {
		this.meal = new MealImpl();
	}

	public MealBuilder addItem(Item item) {
		meal.addItem(item);
		return this;
	}
	
	public MealBuilder removeItem(Item item) {
		meal.removeItem(item);
		return this;
	}

	public Meal build() {
		return meal;
	}
}
