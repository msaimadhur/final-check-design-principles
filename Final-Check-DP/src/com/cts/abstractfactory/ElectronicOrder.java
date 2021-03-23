package com.cts.abstractfactory;

public class ElectronicOrder extends Order{

	public ElectronicOrder(String channel, String productType)
	{
		super(channel,productType);
	}
	
	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		
		System.out.println("The order for "+getProductType()+" product has been processed through "+getChannel());
		
	}

}