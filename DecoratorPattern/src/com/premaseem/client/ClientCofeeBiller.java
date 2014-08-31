package com.premaseem.client;


import java.util.Scanner;

public class ClientCofeeBiller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out
					.println("This is the Client Main file for Observer Pattern where user can attach and detech subject on runtime without hard coded data");
			System.out
					.println("User is acting as a borker here and he can choose to turn on notification from 2 different companies");

			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}
}
