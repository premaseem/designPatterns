package com.premaseem.mediator.atc;

import java.util.Scanner;

public class ClientFileForATCmediator {

	public static void main(String[] args) {

		System.out.println("Welcome to Air Traffic Control program which uses Mediator design based architecture  ");
		Scanner scan = new Scanner(System.in);

		// Object initialization block
		AtcMediator atcMediator = new AtcMediator();
		Flight inOperationFlight;
		Flight flight1 = new Flight(atcMediator, "Air India ");
		Flight flight2 = new Flight(atcMediator, "American Air Lines ");
		Flight flight3 = new Flight(atcMediator, "British Air ways ");

		// User input block
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Which flight do you want to operate  ? ");
			System.out.println("press 1 for Air India");
			System.out.println("press 2 for American Air Lines ");
			System.out.println("press 3 for British Air ways ");

			int choice = scan.nextInt();
			if (choice == 1) {
				inOperationFlight = flight1;
			} else if (choice == 2) {
				inOperationFlight = flight2;
			} else {
				inOperationFlight = flight3;
			}

			System.out.println("What do you want to do with the fligh " + inOperationFlight.name);
			System.out.println(" Press 1 to Grant landing permission ");
			System.out.println(" Press 2 to Land the Flight ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					inOperationFlight.grantLandingPermission();
					break;
				case 2:
					inOperationFlight.landFlight();
					break;

				}
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to Continue flight operations  .... ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "no";
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
