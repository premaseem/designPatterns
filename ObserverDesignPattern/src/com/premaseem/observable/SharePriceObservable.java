package com.premaseem.observable;

import java.util.ArrayList;

import com.premaseem.observer.ShareBrokerObserver;

public interface SharePriceObservable {

//	public ArrayList<ShareBrokerObserver> shareBrokers = new ArrayList<ShareBrokerObserver>();
	
	public void addObserver(ShareBrokerObserver shareBrokerObserver);
	
	public void removeObserver(ShareBrokerObserver shareBrokerObserver);
	
	public void notifyObservers();
	
	// This is just a work around to simulate the price from client side 
	public void setCurrentMarketPrice(Integer currentMarketPrice);
}
