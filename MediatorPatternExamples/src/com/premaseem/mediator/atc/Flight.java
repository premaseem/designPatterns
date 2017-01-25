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
		System.out.println("just added this line for training")
		System.out.println("made changes to address code review comment")
	}

	void landFlight(){
		atcMediator.landFlight(this);
	}
}
