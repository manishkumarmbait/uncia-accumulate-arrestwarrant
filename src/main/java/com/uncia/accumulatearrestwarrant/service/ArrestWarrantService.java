package com.uncia.accumulatearrestwarrant.service;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uncia.accumulatearrestwarrant.model.ArrestWarrant;
import com.uncia.accumulatearrestwarrant.model.Person;
import com.uncia.accumulatearrestwarrant.model.Ticket;
import com.uncia.accumulatearrestwarrant.model.TicketPerson;

@Service
public class ArrestWarrantService {

	@Autowired
	private KieContainer kieContainer;

	public List<ArrestWarrant> getResponse(TicketPerson ticketPerson) {

		Person person = ticketPerson.getPerson();
		List<ArrestWarrant> warrantList = new ArrayList<>();
		KieSession kieSession = kieContainer.newKieSession();
		
		try {
			kieSession.insert(person);
			List<Ticket> ticketList = ticketPerson.getTicket();
			for (Ticket ticket : ticketList) {
				kieSession.insert(ticket);
			}
			kieSession.fireAllRules();
			System.out.println("===== QUERYING =====");
			QueryResults results = kieSession.getQueryResults("GetWarrants");

			for (QueryResultsRow row : results) {
				ArrestWarrant warrant = (ArrestWarrant) row.get("warrant");
				System.out.println(warrant);
			}
		} catch (Throwable t) {
			t.printStackTrace();
		} finally {
			kieSession.dispose();
		}
		return warrantList;
	}
}