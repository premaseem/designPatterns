package com.premaseem.observer.impl;

import com.premaseem.observer.ShareBrokerObserver;

public class ShareBroker1 implements ShareBrokerObserver{

	@Override
	public void notifyCurrentPrice(Integer shareLatestPrice,
			String shareCompanyName) {
		System.out.println();
		System.out.println(this.getClass().getSimpleName() +  ": Notified $$ ");
		System.out.printf("Latest price of %S Share is %d ", shareCompanyName,shareLatestPrice);
		System.out.println();
	}
}
