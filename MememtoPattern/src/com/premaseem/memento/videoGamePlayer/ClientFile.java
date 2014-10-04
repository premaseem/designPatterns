package com.premaseem.memento.videoGamePlayer;

import java.util.Scanner;

public class ClientFile {

	public static void main(String[] args) {

		System.out.println("Welcome to Memento Pattern Video Game ");
		Scanner scan = new Scanner(System.in);

		CareTaker careTaker = new CareTaker();
		GamePlayer player = new GamePlayer();

		System.out.println("Please enter your player name ...  ");
		player.setPlayerName(scan.next());

		String repeatRunFlag = "yes";
		while (!repeatRunFlag.equalsIgnoreCase("no")) {

			System.out.println("Please enter your players Mask name eg. Bat man, super Man  ");
			player.setMaskPicked(scan.next());

			System.out.println("Game started pointed incread and level changed ");
			System.out.println("current state of player " + player);

			player.increase100Points();
			System.out.println("current state of player " + player);

			System.out.println("Do you want to save your game enter restore point name ");
			careTaker.saveGame(scan.next(), player);
			player.increase100Points();
			System.out.println("Game over with points few more points ");
			System.out.println(player);
			
			System.out.println("Do you want to restore your game enter resotre point  ");
			careTaker.restoreGame(scan.next(), player);

			System.out.println("Restored  state of player " + player);

			System.out.println("=============================");

			System.out.println("Press No to Exit and any other character to repeat  .... ");
			try {
				repeatRunFlag = scan.next();
			} catch (Exception e) {
				repeatRunFlag = "no";
			}
		}

		System.out.println("\n $$$$$$$$$$$$$$$$$$$$  Thanks by Prem Aseem $$$$$$$$$$$$$$$$$$$$$$ \n ");
		System.out.println("\n $$$$$$$$$$$$$$$$$$$$$  www.premaseem.com  $$$$$$$$$$$$$$$$$$$$$$ \n ");

	}
}
