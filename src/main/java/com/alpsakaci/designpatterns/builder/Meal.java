package com.alpsakaci.designpatterns.builder;


public interface Meal {
	public void addItem(Item item);
	public void removeItem(Item item);
	public float getCost();
	public void showItems();
}
