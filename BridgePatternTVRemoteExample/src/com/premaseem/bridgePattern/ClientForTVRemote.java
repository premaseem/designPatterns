package com.premaseem.bridgePattern;


import java.util.Scanner;

public class ClientForTVRemote {

	public static void main(String[] args) {

		System.out.println("Welcome to TV remote example using Bridge Pattern ");
		Scanner scan = new Scanner(System.in);

		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {
			TVInterface tv;
			System.out.println("Which is your TV company ? ");
			System.out.println("press 1 for Sony");
			System.out.println("press 2 for Philip ");
			int tvType = scan.nextInt();
			if (tvType == 1) {
				tv = new SonyTVimpl();
			} else {
				tv = new PhilipTVimpl();
			}

			System.out.println("What do you want to do with the remote ");
			System.out.println(" Press 1 to set channel");
			System.out.println(" Press 2 for some light music ");
			System.out.println(" Press 3 to record program  ");

			RemoteInterface remote = new RemoteInterfaceImpl(tv);
			int type = scan.nextInt();
			try {
				switch (type) {
				case 1:
					remote.playChannel();
					break;
				case 2:
					remote.playMusic();
					break;
				case 3:
					remote.record();
					break;

				}
			} catch (Exception e1) {
				System.out.println("################ Access is not valid ###############");
			}
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
