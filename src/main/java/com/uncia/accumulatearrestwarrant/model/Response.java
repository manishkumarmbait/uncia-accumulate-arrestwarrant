package com.uncia.accumulatearrestwarrant.model;

public class Response {

	private Person person;
	private String reason;
	private String message;
	private Double amount;

	public Response() {
	}

	public Response(Person person, String reason, String message, Double amount) {
		super();
		this.person = person;
		this.reason = reason;
		this.message = message;
		this.amount = amount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
