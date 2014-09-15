package com.premaseem.templateMethod;

import java.util.Scanner;

public class ClientForTemplateMethodJuicer {

	public static void main(String[] args) {

		System.out.println("Welcome to Template Method Fruit Juice Extractor Program ");

		AbstractBaseJuice juice;
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println("What fruit Juice would you like to have today ");
			System.out.println(" Press 1 for Apple Milk Shake Juice");
			System.out.println(" Press 2 for Orange Juice ");
			System.out.println(" Press 3 for Mix fruit Juice ");

			int type = scan.nextInt();

			switch (type) {
			case 1:
				juice = new AppleMilkJuice();
				break;
			case 2:
				juice = new OrangeJuice();
				break;
			case 3:
				juice = new MixFruitJuice();
				break;
			default:
				juice = new MixFruitJuice();
			}
			
			juice.prepare();
			System.out.println("=============================");

			System.out.println("Press 1 for more entertainment and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
