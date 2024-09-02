package com.uncia.accumulatearrestwarrant.model;

public class Ticket {
	private Person driver;
	private Double amount;
	private String reason;
	private String driverType;
	private Boolean friendsOfTheSheriff;

	public Ticket() {
	}

	public Ticket(Person driver, Double amount, String reason, Boolean friendsOfTheSheriff, String driverType) {
		this.driver = driver;
		this.amount = amount;
		this.reason = reason;
		this.driverType = driverType;
		this.friendsOfTheSheriff = friendsOfTheSheriff;
	}

	public Person getDriver() {
		return driver;
	}

	public void setDriver(Person driver) {
		this.driver = driver;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDriverType() {
		return driverType;
	}

	public void setDriverType(String driverType) {
		this.driverType = driverType;
	}

	public Boolean getFriendsOfTheSheriff() {
		return friendsOfTheSheriff;
	}

	public void setFriendsOfTheSheriff(Boolean friendsOfTheSheriff) {
		this.friendsOfTheSheriff = friendsOfTheSheriff;
	}

}
