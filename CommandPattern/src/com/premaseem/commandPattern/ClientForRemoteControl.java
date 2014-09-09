package com.premaseem.commandPattern;

import java.util.Scanner;

public class ClientForRemoteControl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Command Pattern with Remote control Example ");
			
			System.out.println("Loading the remote with approviate commands and mapping them in slots ... ");
			
			System.out.println("Please press the any command between 0 to 10 for operation ");
			System.out.println("Remember 0 is for UNDO and 10 is celebration mode ");

			
			RemoteControl remote = new RemoteControl();
			RemoteControlLoader loader = new RemoteControlLoader(remote);
			loader.load();
			
			int remoteButtonNumber = scan.nextInt();
			remote.remoteButtonPress(remoteButtonNumber);
			


			// invoker Remote 
			// reciever devices
			// command - command
			// client

			// PizzaBase pizza = PizzaFactory.getPizza(pizzaType);

			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}
		}
	}
}
