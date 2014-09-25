package com.premaseem.builderPattern;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to the Mc Donal which uses Builder Design pattern to build their Meals ");
		Scanner scan = new Scanner(System.in);

		int repeatRunFlag = 1;
		MealBuilder mealBuilder = new MealBuilder();
		Meal meal = null;
		while (repeatRunFlag == 1) {
			System.out.println("Which Meal would you like to order ? ");
			System.out.println("press 1 for Veg Meal");
			System.out.println("press 2 for Non Veg Meal ");

			int tvType = scan.nextInt();
			if (tvType == 1) {
				meal = mealBuilder.buildVegMeal();
			} else {
				meal = mealBuilder.buildNonVegMeal();
			}

			
			System.out.println("You meal is " + meal);
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
