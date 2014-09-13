package com.premaseem.statePattern;

import java.util.Scanner;

public class ClientForMedicalTreatment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;

		System.out.println("This is State Pattern example where in treatment would be dependent on the state of the patient ) ");
		TreatmentContext context = new TreatmentContext();

		// applyOxygen

		while (repeatRunFlag == 1) {
		// Uncomment below line to take input of patient type 
			// takePatientTypeInput(scan, context);
			
			context.setState(context.unStablePatientState);
			System.out.println("What treatment should be given to this patient with current state " + context.getState().getClass().getSimpleName());
			System.out.println(" Press 1 for admiting in ICU");
			System.out.println(" Press 2  for prescribing general Medicine ");
			System.out.println(" Press 3 for supply of Oxygen");
			System.out.println(" Press 4 for supply of Normal food");
			System.out.println(" Press 5 for recommending a walk ");

			int treatmentType = scan.nextInt();

			switch (treatmentType) {
			case 1:
				context.admitInICU();
				break;
			case 2:
				context.prescribeGeneralMedicine();
				break;
			case 3:
				context.supplyOxygen();
				break;
			case 4:
				context.supplyNormalFood();
				break;

			case 5:
				context.recommendWalking();
				break;
			}

			System.out.println("Current state of Pateint is  " + context.getState().getClass().getSimpleName());
			System.out.println("Press 1 for further treamemt and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}
	}

	private static void takePatientTypeInput(Scanner scan, TreatmentContext context) {
	    System.out.println("Please choose state of your patient before starting treatment ");
	    System.out.println(" Press 1 for unstalbe state patient");
	    System.out.println(" Press 2 for stable state patient ");
	    System.out.println(" Press 3 for dischargable state patient ");
	    int entType = scan.nextInt();

	    switch (entType) {
	    case 1:
	    	context.setState(context.stablePatientState);
	    	break;
	    case 2:
	    	context.setState(context.unStablePatientState);
	    	break;
	    case 3:
	    	context.setState(context.dischargePatientState);
	    	break;
	    }
    }
}
