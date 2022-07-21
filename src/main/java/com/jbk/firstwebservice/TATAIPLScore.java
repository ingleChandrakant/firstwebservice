package com.jbk.firstwebservice;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TATAIPLScore {
	
	@RequestMapping("matchdetails")
	ArrayList<Match> detailsAboutMatches() {
	
		ArrayList<Match> a1 = new ArrayList<Match> ();
		
		Match match = new Match(240, 40, 2, 5, 22);
		Match match1 = new Match(250, 41, 2, 5, 22);
		Match match2 = new Match(240, 30, 2, 5, 22);
		Match match3 = new Match(240, 32, 2, 5, 22);
		a1.add(match3);
		a1.add(match2);
		a1.add(match1);
		a1.add(match);
		
		return a1;
	
	}
	
	@PostMapping("ticketbooking")
	public void bookTicket(@RequestBody Ticket ticket ) {
		System.out.println(ticket);
	}
	
	
	
	@GetMapping("ticketbooking1/{Name}/{mobNumber}/{standName}/{Qty}")
	public void bookTicket(@PathVariable String name ,@PathVariable String mobNumber,@PathVariable String standName,@PathVariable String Qty) {
		System.out.println(name);
		System.out.println(mobNumber);
		System.out.println(standName);
		System.out.println(Qty);
		
	}
	
	@GetMapping (" with notepad ++")
	public void practice (){
		
		i=0;
		if {( i = 0 ; i<5; i++)
		System.out.println(name);}
		
	
	
	
	
	@GetMapping("playerList/{ContryName}")
	
	ArrayList<String> givePlayerNameOfAnyContry(@PathVariable String ContryName){
	if (ContryName.equals("India")) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Kohli");
	a1.add("Dhoni");
	a1.add("Rohit");
	a1.add("Hardik");
	return a1;
	
	}
	else {
		ArrayList<String> a1 = new ArrayList<String>();
			a1.add("Pointing");
			a1.add("maxwell");
			a1.add("Stoinis");
			a1.add("nisham");
			return a1;
		
	
	}
	}
	
	
	
	
	
	@RequestMapping("matchdetail")
	Match detailAboutMatches() {
		
		Match match = new Match(240, 40, 2, 5, 22);
		
	return match;
	}
	
	
	@RequestMapping("liveScore")
	int getTATAIPLScore(){
		
		
		
		return 160;
		
	}
	@RequestMapping("matchschedule")
	ArrayList<String> givematchschedule(){
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("RR VS CSK");
		a1.add("Csk vs mi");
		a1.add("mi vs gt");
		a1.add("Gt vs RCB");
		return a1;
	}
}
