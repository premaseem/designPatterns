package com.premaseem;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to TV remote example using Bridge Pattern ");
		Scanner scan = new Scanner(System.in);

		// Object initialization block
	
		
		
		// User input block 
		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Which is your TV company ? ");
			System.out.println("press 1 for Sony");
			System.out.println("press 2 for Philip ");
			int choice = scan.nextInt();
			if (choice == 1) {

			} else {

			}

			System.out.println("What do you want to do with the remote ");
			System.out.println(" Press 1 to set channel");
			System.out.println(" Press 2 for some light music ");
			System.out.println(" Press 3 to record program  ");

			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;

				}
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat  .... ");
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
