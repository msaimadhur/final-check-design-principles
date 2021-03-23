package com.cts.observer;

public class Main {
	private static INotificationService notificationService;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer john=new Admin("John");
		Observer dwayne=new Admin("Dwayne");
		Observer joey=new Admin("Joey");
		
		Events wrestleMania = new Events("Wrestlemania", 150);
		Events worldCup = new Events("WorldCup", 99);
		Events ipl = new Events("IPL",115);
		Events wimbledon = new Events("Wimbledon", 101);
		notificationService=new NotificationService();
		notificationService.addSubscriber(john);
		notificationService.addSubscriber(dwayne);
		notificationService.addSubscriber(joey);
		notificationService.addEvent(wrestleMania);
		notificationService.addEvent(worldCup);
		notificationService.addEvent(ipl);
		notificationService.addEvent(wimbledon);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(joey);
		notificationService.notifySubscriber();
		notificationService.removeEvent(wimbledon);
		notificationService.notifySubscriber();
		
	}

}