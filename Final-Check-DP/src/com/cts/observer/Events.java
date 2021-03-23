package com.cts.observer;

public class Events {
	private String nameOfEvent;
	private int noOfTickets;
	public Events(String nameOfEvent, int noOfTickets) {
		super();
		this.nameOfEvent = nameOfEvent;
		this.noOfTickets = noOfTickets;
	}
	public String getNameOfEvent() {
		return nameOfEvent;
	}
	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public Events() {
		super();
	}
	
	
}
