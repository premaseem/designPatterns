package com.premaseem.client;

import java.util.Random;
import java.util.Scanner;

import com.premaseem.observable.SharePriceObservable;
import com.premaseem.observable.impl.Company1Share;
import com.premaseem.observable.impl.Company2Share;
import com.premaseem.observer.ShareBrokerObserver;
import com.premaseem.observer.impl.ShareBroker1;
import com.premaseem.observer.impl.ShareBroker2;
import com.premaseem.observer.impl.ShareBroker3;


public class ShareMarketClientMain {

	public static void main(String[] args) {
		System.out.println("This is the Client Main file for Observer Pattern");
		System.out.println("There are 3 brokers which want to observe current rate of various shares");
		System.out.println("They might subscribe or unsubscribe to a particular company share ");
		ShareBrokerObserver shareBroker1 = new ShareBroker1();
		ShareBrokerObserver shareBroker2 = new ShareBroker2();
		ShareBrokerObserver shareBroker3 = new ShareBroker3();
		
		SharePriceObservable company1Share = new Company1Share();
		SharePriceObservable company2Share = new Company2Share();
		
		System.out.println("Share broker 1 and 2 would observe company 1");
		company1Share.addObserver(shareBroker1);
		company1Share.addObserver(shareBroker2);
		
		System.out.println("Share broker 2 and 3 would observe company 2");
		company2Share.addObserver(shareBroker2);
		company2Share.addObserver(shareBroker3);
		
		System.out.println("Simulating price change for company 1 ");
		simulateSharePriceChange(company1Share);
		System.out.println("========================================");
		
		System.out.println("Simulating price change for company 2 ");
		simulateSharePriceChange(company2Share);
		System.out.println("========================================");
		
		
		System.out.println("All brokers has left share of company 1 and now observing only company 2");
		company1Share.removeObserver(shareBroker1);
		company1Share.removeObserver(shareBroker2);
		company1Share.removeObserver(shareBroker3);
		
		company2Share.addObserver(shareBroker1);
		company2Share.addObserver(shareBroker2);
		company2Share.addObserver(shareBroker3);
		
		
		System.out.println("Simulating price change for company 1 ");
		simulateSharePriceChange(company1Share);
		System.out.println("========================================");
		
		System.out.println("Simulating price change for company 2 ");
		simulateSharePriceChange(company2Share);
		System.out.println("========================================");
		
		System.out.println();
		System.out.println("                 Thanks by Prem Aseem ");
	}
	
	public static void simulateSharePriceChange(SharePriceObservable sharePriceObservable){
		Random rnd = new Random();
		for(int i=0;i<2;i++){
			sharePriceObservable.setCurrentMarketPrice(rnd.nextInt());
		}
	}
}
