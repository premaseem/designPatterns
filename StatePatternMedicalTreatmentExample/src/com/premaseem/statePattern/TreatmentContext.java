package com.premaseem.statePattern;

public class TreatmentContext {

	PatientHealthState state;
	StablePatientState stablePatientState = new StablePatientState(this);
	UnStablePatientState unStablePatientState = new UnStablePatientState(this);
	DischargePatientState dischargePatientState = new DischargePatientState(this);
	

	public PatientHealthState getState() {
		return state;
	}

	public void setState(PatientHealthState state) {
		this.state = state;
	}
	
	
	void prescribeGeneralMedicine(){
		state.prescribeGeneralMedicine();
	}
	
	void admitInICU(){
		state.admitInICU();
	}
	
	
	void supplyOxygen(){
		state.supplyOxygen();
	}
	
	void supplyNormalFood(){
		state.supplyOralFood();
	}
	
	void recommendWalking(){
		state.recommendWalking();
	}
	
}
