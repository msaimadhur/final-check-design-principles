package com.cts.abstractfactory;

public class TeleMarketingOrderFactory implements OrderFactory {
	private String channelName = "Telemarketing Agent";
	private Order order;
	
	@Override
	public void orderFurniture() {
		order = new FurnitureOrder(channelName, "Furniture");

		order.processOrder();
	}

	@Override
	public void orderToys() {
		order = new ElectronicOrder(channelName, "Electronic");
		order.processOrder();

	}

	@Override
	public void orderElectronic() {
		order = new ToysOrder(channelName, "Toys");
		order.processOrder();

	}


}
