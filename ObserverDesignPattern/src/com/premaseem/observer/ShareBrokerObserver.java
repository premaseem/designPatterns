package com.premaseem.observer;

public interface ShareBrokerObserver {

	public void notifyCurrentPrice(Integer shareLatestPrice, String shareCompanyName);
	
}
