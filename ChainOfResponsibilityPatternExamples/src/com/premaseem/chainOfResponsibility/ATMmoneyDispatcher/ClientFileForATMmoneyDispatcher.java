package com.premaseem.chainOfResponsibility.ATMmoneyDispatcher;

import java.util.Scanner;

public class ClientFileForATMmoneyDispatcher {

	public static void main(String[] args) {

		System.out.println("Welcome to Number identifier program designed using Chain of Responsibility ");
		Scanner scan = new Scanner(System.in);
		
		MoneyChainHandler thousandollarHandler_1000 = new ThousandollarHandler_1000(1000);
		MoneyChainHandler FiveHundredollarHandler_500 = new FiveHundredollarHandler_500(500);
		MoneyChainHandler HundrendollarHandler_100 = new HundrendollarHandler_100(100);
		MoneyChainHandler FiftydollarHandler_50 = new FiftydollarHandler_50(50);
		MoneyChainHandler TendollarHandler_10 = new TendollarHandler_10(10);
		MoneyChainHandler FivedollarHandler_5 = new FivedollarHandler_5(5);
		MoneyChainHandler TwodollarHandler_2 = new TwodollarHandler_2(2);
		MoneyChainHandler OnedollarHandler_1 = new OnedollarHandler_1(1);
		
		// Setting up the change
		thousandollarHandler_1000.setNextHandler(FiveHundredollarHandler_500);
		FiveHundredollarHandler_500.setNextHandler(HundrendollarHandler_100);
		HundrendollarHandler_100.setNextHandler(FiftydollarHandler_50);
		FiftydollarHandler_50.setNextHandler(TendollarHandler_10);
		TendollarHandler_10.setNextHandler(FivedollarHandler_5);
		FivedollarHandler_5.setNextHandler(TwodollarHandler_2);
		TwodollarHandler_2.setNextHandler(OnedollarHandler_1);

		String repeatRunFlag = "y";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {
			System.out.println("Please enter amount you want to withdraw eg 3450 ");
			int choice = scan.nextInt();
			thousandollarHandler_1000.handler(choice);

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat ....  ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "n";
			}
		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");	

	}
}
