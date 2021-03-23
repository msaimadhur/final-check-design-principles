package com.cts.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class NotificationService implements INotificationService {
	public List<Observer> observers=new ArrayList<Observer>();
	public static HashMap<String, Integer> eventMap = new HashMap<String, Integer>();
	@Override
	public void addSubscriber(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		System.out.println("List after adding the observer " +observer);
		System.out.println(observers);
		
	}

	@Override
	public void removeSubscriber(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		System.out.println("List after removing the observer " +observer);
		System.out.println(observers);
		
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(Observer observer:observers)
		{
			observer.setNotification();
		}
		
	}
	@Override
	public void addEvent(Events e)
	{
		eventMap.put(e.getNameOfEvent(), e.getNoOfTickets());
		System.out.println("Map after adding the event "+e.getNameOfEvent());
		System.out.println(eventMap);

	}


	@Override
	public void removeEvent(Events e) {
		eventMap.remove(e.getNameOfEvent());
		System.out.println("Map affter removing "+e.getNameOfEvent()+" event ");
		System.out.println(eventMap);
	}
}