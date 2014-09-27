package com.premaseem.flyWeight;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to the star tracker example using Fly Weight pattern ");
		Scanner scan = new Scanner(System.in);
		StarFactory starFactory = new StarFactory();
		Star star = null;
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println(" Which star you want to draw ");
			System.out.println("press 1 for PoleStar");
			System.out.println("press 2 for DraughStar ");
			System.out.println("press 3 for SuperNoveStar ");
			int tvType = scan.nextInt();
			System.out.println(" Enter placement of Center of star in number ");
			String center = scan.next();

			if (tvType == 1) {
				star = starFactory.getStar("PoleStar");
			} else if (tvType == 2) {
				star = starFactory.getStar("DraughStar");
			} else {
				star = starFactory.getStar("SuperNoveStar");
			}

			star.setCenter(center);
			System.out.println("=============================");
			System.out.println(star);
			System.out.println("=============================");

			System.out.println("Press 1 to Repeat .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
