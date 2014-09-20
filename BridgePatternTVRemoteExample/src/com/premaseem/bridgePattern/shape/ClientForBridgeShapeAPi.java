package com.premaseem.bridgePattern.shape;

import java.util.Scanner;

public class ClientForBridgeShapeAPi {

	public static void main(String[] args) {

		System.out.println("Welcome to TV remote example using Bridge Pattern ");
		Scanner scan = new Scanner(System.in);

		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			ShapeAPI shapeApi;
			System.out.println("Which color drawing you want to draw ? ");
			System.out.println("press 1 for Green ");
			System.out.println("press 2 for Blue");
			int tvType = scan.nextInt();
			if (tvType == 1) {
				shapeApi = new GreenShapeAPI();
			} else {
				shapeApi = new BlueShapeAPI();
			}

			System.out.println("Which shape do you want ");
			System.out.println(" Press 1 for Circle");
			System.out.println(" Press 2 for Rectanble ");

			Shape shape = new Circle(shapeApi);
			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					shape = new Circle(shapeApi);
					break;
				case 2:
					shape = new Rectangle(shapeApi);
					break;

				}
				
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
			shape.draw();
			System.out.println("=============================");

			System.out.println("Press 1 to Repeat .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
