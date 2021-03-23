package com.cts.abstractfactory;

public class FurnitureOrder extends Order{

	public FurnitureOrder(String channel, String productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {
		System.out.println("The order for "+getProductType()+" product has been processed through "+getChannel());

	}

}
