package com.cts.observer;

import java.util.HashMap;
import java.util.Map;

public class Admin implements Observer{
	private String nameOfAdmin;
	public HashMap<String, Integer>eventMap2 = NotificationService.eventMap;
	public Admin(String nameOfAdmin) {
		super();
		this.nameOfAdmin = nameOfAdmin;
	}
	
	@Override
	public void setNotification() {
		// TODO Auto-generated method stub
		for(Map.Entry<String, Integer> entry : eventMap2.entrySet())
		{
			if(entry.getValue()>100)
			System.out.println("Notification has been received by "+nameOfAdmin+" for "+entry.getKey());
		}
	}
	public String toString()
	{
		return nameOfAdmin;
	}
	
}