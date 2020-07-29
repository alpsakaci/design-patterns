package com.alpsakaci.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class MealImpl implements Meal {
	private List<Item> items = new ArrayList<Item>();
	
	@Override
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	@Override
	public float getCost() {
		float cost = 0.0f;
		
		for (Item item : items) {
			cost += item.price();
		}
		
		return cost;
	}
	
	@Override
	public void showItems() {
		for (Item item : items) {
			System.out.print("Item: " + item.name());
			System.out.print(", Packing: " + item.packing().pack());
			System.out.println(", Price: " + item.price());
		}
	}
}
