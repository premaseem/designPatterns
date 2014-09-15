package com.premaseem.composite;

import java.util.Scanner;

public class ClientForHotelMenuCompositeDesig {

	public static void main(String[] args) {

		System.out.println("Welcome to composite hotel menu example which uses composite design pattern to keep its all menu items  ");

		MenuComponent MenuTop = new Menu("Main menu", "Pick any thing under this ");
		MenuComponent lunchMenu = new Menu("Lunch ", " Menu");
		lunchMenu.getSubMenu().add(new MenuItem("roti", "", true));
		lunchMenu.getSubMenu().add(new MenuItem("dal", "", true));
		lunchMenu.getSubMenu().add(new MenuItem("sabji", "", true));
		Menu eggmenu = new Menu("Egg items", "");
		eggmenu.getSubMenu().add(new MenuItem("Egg ", "white", false));
		eggmenu.getSubMenu().add(new MenuItem("Egg ", "yello", false));

		MenuComponent dinnerMenu = new Menu("Dinner ", " Menu");
		dinnerMenu.getSubMenu().add(new MenuItem("daliya", "", true));
		dinnerMenu.getSubMenu().add(new MenuItem("rice", "", true));

		Menu milkmenu = new Menu("Egg items", "");
		milkmenu.getSubMenu().add(new MenuItem("Milk ", "hot", false));
		milkmenu.getSubMenu().add(new MenuItem("Cream ", "cold", false));
		Menu soyamilkmenu = new Menu("Soya Milk item", " yet to be launch ");

		MenuComponent specialDish = new MenuItem("Jalabi", "suger coated round", true);

		// level 1
		MenuTop.addChild(lunchMenu);
		MenuTop.addChild(dinnerMenu);
		MenuTop.addChild(specialDish);

		// level 2
		lunchMenu.addChild(eggmenu);
		dinnerMenu.addChild(milkmenu);

		// level 3
		milkmenu.addChild(soyamilkmenu);
		MenuComponent desirableMenu;
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			System.out.println("What would you like to do with your entertainment unit today ");
			System.out.println(" Press 1 for All menu items");
			System.out.println(" Press 2 for Lunch Menu ");
			System.out.println(" Press 3 for Dinner Menu ");

			int entType = scan.nextInt();

			switch (entType) {
			case 1:
				desirableMenu = MenuTop;
				break;
			case 2:
				desirableMenu = lunchMenu;
				break;
			case 3:
				desirableMenu = dinnerMenu;
				break;
			default:
				desirableMenu = MenuTop;
			}
			desirableMenu.printMenuTree();
			System.out.println("=============================");

			System.out.println("Press 1 for more entertainment and 0 for EXIT .... ");
			try {
				repeatRunFlag = scan.nextInt();
			} catch (Exception e) {
				repeatRunFlag = 0;
			}

		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");

	}
}
