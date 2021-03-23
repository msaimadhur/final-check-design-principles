package com.cts.abstractfactory;

public class Client {

	public static void main(String[] args) {

		
		OrderFactory orderFactory1 = new ECommerceOrderFactory();
		
		OrderFactory orderFactory2 = new TeleMarketingOrderFactory();
		
		orderFactory1.orderElectronic(); 		
		orderFactory2.orderFurniture();
		orderFactory1.orderToys();

		
	}

}
