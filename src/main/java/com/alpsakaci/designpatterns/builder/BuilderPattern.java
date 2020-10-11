package com.alpsakaci.designpatterns.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		System.out.println("Meal");
		Meal meal = mealBuilder
				.addItem(new ChickenBurger())
				.addItem(new Coke())
				.build();
		meal.showItems();
		System.out.println("Total Cost: " + meal.getCost());
	}

}
