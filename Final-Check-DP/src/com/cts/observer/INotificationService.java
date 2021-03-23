package com.cts.observer;

public interface INotificationService {
	void addSubscriber(Observer observer);
	void removeSubscriber(Observer observer);
	void notifySubscriber();
	void addEvent(Events e);
	void removeEvent(Events e);
}