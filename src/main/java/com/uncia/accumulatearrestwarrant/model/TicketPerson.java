package com.uncia.accumulatearrestwarrant.model;

import java.util.List;

public class TicketPerson {

	private Person person;
	private List<Ticket> ticket;

	public TicketPerson() {
	}

	public TicketPerson(Person person, List<Ticket> ticket) {
		super();
		this.person = person;
		this.ticket = ticket;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
}