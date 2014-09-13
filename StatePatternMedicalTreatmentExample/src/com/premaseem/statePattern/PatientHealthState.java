package com.premaseem.statePattern;

public interface PatientHealthState {

	void supplyOxygen();

	void supplyOralFood();

	void recommendWalking();

	void prescribeGeneralMedicine();

	void admitInICU();
}

class StablePatientState implements PatientHealthState {

	TreatmentContext context;

	public StablePatientState(TreatmentContext context) {
		this.context = context;
	}

	@Override
	public void supplyOxygen() {
		System.out.println("Stable pateint do not need oxygen ");
	}

	@Override
	public void supplyOralFood() {
		System.out.println(" Required at this stage and lets pateint to become healthy and get discharged ");
		 context.setState(context.stablePatientState);
	}

	@Override
	public void recommendWalking() {
		System.out.println(" Do not walk while pateient get discharge ");
	}

	@Override
	public void prescribeGeneralMedicine() {
		System.out.println(" will help in improvement ");
	}

	@Override
	public void admitInICU() {
		System.out.println(" No need of ICU ");
		context.setState(context.unStablePatientState);
	}
}

class UnStablePatientState implements PatientHealthState {

	TreatmentContext context;

	public UnStablePatientState(TreatmentContext context) {
		this.context = context;
	}

	@Override
	public void supplyOxygen() {
		System.out.println("UnStable pateint do need oxygen ");
		context.setState(context.stablePatientState);
	}

	@Override
	public void supplyOralFood() {
		System.out.println(" supply blood and liquids - no oral food please ");
		context.setState(context.stablePatientState);
	}

	@Override
	public void recommendWalking() {
		System.out.println(" Do not dare ");
	}

	@Override
	public void prescribeGeneralMedicine() {
		System.out.println(" needs advanded medicine other wise patient will become unstable ");
	}

	@Override
	public void admitInICU() {
		System.out.println(" Correct step ");
	}
}

class DischargePatientState implements PatientHealthState {

	TreatmentContext context;

	public DischargePatientState(TreatmentContext context) {
		this.context = context;
	}

	@Override
	public void supplyOxygen() {
		System.out.println("Will make patient unstable ...  ");
		context.setState(context.unStablePatientState);
	}

	@Override
	public void supplyOralFood() {
		System.out.println(" enjoy ");
		// context.setState(context.);
	}

	@Override
	public void recommendWalking() {
		System.out.println(" Enjoy  ");
	}

	@Override
	public void prescribeGeneralMedicine() {
		System.out.println(" no need ");
	}

	@Override
	public void admitInICU() {
		System.out.println(" no need");
		context.setState(context.unStablePatientState);
	}
}