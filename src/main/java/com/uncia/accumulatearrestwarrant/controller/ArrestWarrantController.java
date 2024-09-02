package com.uncia.accumulatearrestwarrant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uncia.accumulatearrestwarrant.model.ArrestWarrant;
import com.uncia.accumulatearrestwarrant.model.Person;
import com.uncia.accumulatearrestwarrant.model.Ticket;
import com.uncia.accumulatearrestwarrant.model.TicketPerson;
import com.uncia.accumulatearrestwarrant.service.ArrestWarrantService;

@RestController
@RequestMapping("/ruleservice")
public class ArrestWarrantController {

	@Autowired
	private ArrestWarrantService arrestWarrantService;

//	@PostMapping("/getOD")
//	public ResponseEntity<String> getRate(@RequestBody TickerPerson tickerPerson) {
//		String response = arrestWarrantService.getResponse(tickerPerson);
//		return new ResponseEntity<>(response, HttpStatus.OK);
//	}
	
//	@PostMapping("/getOD")
//	public ResponseEntity<List<ArrestWarrant>> getRate(@RequestBody TicketPerson ticketPerson) {
//		List<ArrestWarrant> warrantList = arrestWarrantService.getResponse(ticketPerson);
//		return new ResponseEntity<>(warrantList, HttpStatus.OK);
//	}
	
	@PostMapping("/getOD")
	public ResponseEntity<List<ArrestWarrant>> getRate(@RequestBody TicketPerson ticketPerson) {
		List<ArrestWarrant> response = arrestWarrantService.getResponse(ticketPerson);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
