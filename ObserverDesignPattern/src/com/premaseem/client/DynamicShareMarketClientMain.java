package com.premaseem.client;

import java.util.Random;
import java.util.Scanner;

import com.premaseem.observable.SharePriceObservable;
import com.premaseem.observable.impl.Company1Share;
import com.premaseem.observable.impl.Company2Share;
import com.premaseem.observer.ShareBrokerObserver;
import com.premaseem.observer.impl.ShareBroker1;

public class DynamicShareMarketClientMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeatRunFlag = 1;
		while (repeatRunFlag == 1) {

			System.out
					.println("This is the Client Main file for Observer Pattern where user can attach and detech subject on runtime without hard coded data");
			System.out
					.println("User is acting as a borker here and he can choose to turn on notification from 2 different companies");
			ShareBrokerObserver shareBroker1 = new ShareBroker1();

			SharePriceObservable company1Share = new Company1Share();
			SharePriceObservable company2Share = new Company2Share();

			System.out
					.println("Do you want to observer / get notification of share price updates of Infosys shares ? ");
			System.out.println("Press 1 for yes and 0 or other digits for no ");
			int observeInfosysShareFlag = scan.nextInt();
			if(observeInfosysShareFlag==1){
				company1Share.addObserver(shareBroker1);
			}else{
				company1Share.removeObserver(shareBroker1);
			}

			System.out
					.println("Do you want to observer / get notification of share price updates of AccionLabs shares ? ");
			System.out.println("Press 1 for yes and 0 or other digits for no ");
			int observeAccionLabsShareFlag = scan.nextInt();
			if(observeAccionLabsShareFlag==1){
				company2Share.addObserver(shareBroker1);
			}else{
				company2Share.removeObserver(shareBroker1);
			}
			
			
			System.out.println("Simulating price change for Infosys ");
			simulateSharePriceChange(company1Share);
			System.out.println("========================================");

			System.out.println("Simulating price change for Accion Labs ");
			simulateSharePriceChange(company2Share);
			System.out.println("========================================");

			System.out.println("                 Thanks by Prem Aseem ");


			System.out
					.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
			repeatRunFlag = scan.nextInt();
		}
	}

	public static void simulateSharePriceChange(
			SharePriceObservable sharePriceObservable) {
		Random rnd = new Random();
		for (int i = 0; i < 2; i++) {
			sharePriceObservable.setCurrentMarketPrice(rnd.nextInt());
		}
	}
}
