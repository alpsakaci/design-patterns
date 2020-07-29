package com.alpsakaci.designpatterns.builder;

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("VegMeal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("NonVegMeal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		
	}

}
