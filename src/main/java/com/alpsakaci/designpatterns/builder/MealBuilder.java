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
	
//	public Meal prepareVegMeal() {
//		Meal meal = new Meal();
//		meal.addItem(new VegBurger());
//		meal.addItem(new Coke());
//		
//		return meal;
//	}
//	
//	public Meal prepareNonVegMeal() {
//		Meal meal = new Meal();
//		meal.addItem(new ChickenBurger());
//		meal.addItem(new IceTea());
//		
//		return meal;
//	}

	public Meal build() {
		return this.meal;
	}
}
