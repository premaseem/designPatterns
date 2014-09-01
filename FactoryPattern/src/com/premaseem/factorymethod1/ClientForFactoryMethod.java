package com.premaseem.factorymethod1;


import java.util.Scanner;

import com.premaseem.factory.PizzaBase;
import com.premaseem.factory.PizzaFactory;


public class ClientForFactoryMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Factory Method ");

			System.out.println("You have a Car driver lets see what he drives  ");
			VehicleDriver driverSab = new CarDriver();
			driverSab.doSafeDriving();
			
			System.out.println("You have a Bus driver lets see what he drives  ");
			driverSab = new BusDriver();
			driverSab.doSafeDriving();
			
			System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
			System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
		try{
			repeatRunFlag = scan.nextInt();
		}catch(Exception e){
			repeatRunFlag = 0;
		}
		}
	}
}
