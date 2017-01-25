package com.premaseem.mediator.atc;

import com.premaseem.mediator.atc.AtcMediator.FlightStatus;

public class Flight {
	
	FlightStatus status;
	AtcMediator atcMediator=null;
	public String name;
	
	public Flight(AtcMediator atcMediator, String flightName) {
		status = FlightStatus.IN_Q;
		name = flightName;
		this.atcMediator = atcMediator;
	}

	void grantLandingPermission(){
		atcMediator.grantLandingPermission(this);
		System.out.println("modified by me");
	}
	
	void landFlight(){
		atcMediator.landFlight(this);
	}
}
