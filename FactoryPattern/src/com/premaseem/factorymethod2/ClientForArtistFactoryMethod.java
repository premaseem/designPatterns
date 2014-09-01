package com.premaseem.factorymethod2;


import java.util.Scanner;

import com.premaseem.factory.PizzaBase;
import com.premaseem.factory.PizzaFactory;


public class ClientForArtistFactoryMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out.println("This is the Client Main Factory Method ");

			System.out.println("Which artist would you like to entertain you ");
			System.out.println("Enter - Male / Female ");
			
			String artistType =   scan.next();
			Artist artist;
			if(artistType.equalsIgnoreCase("male")){
				artist = new MaleArtist();
			}else{
				artist = new FeMaleArtist();
			}
			
			System.out.println("All the dependent objects are getting created and encapsulated behind the abstract factory method");
			artist.doDanceing();
			artist.doSinging();
			
			
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
