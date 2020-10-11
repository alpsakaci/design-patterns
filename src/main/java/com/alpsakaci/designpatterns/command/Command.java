package com.alpsakaci.designpatterns.command;

public class Command {

	public static void main(String[] args) {
		Stock stock = new Stock();

		BuyStock buyStockOrder = new BuyStock(stock);
		SellStock sellStockOrder = new SellStock(stock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}

}
