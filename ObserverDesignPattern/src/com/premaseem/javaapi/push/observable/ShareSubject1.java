package com.premaseem.javaapi.push.observable;

import java.util.Observable;

public class ShareSubject1 extends Observable {

	private Integer initialPrice = 0;
	private Integer finalCalculatedPrice =100;
	
	public Integer getInitialPrice() {
		return initialPrice;
	}

	public void setInitialPrice(Integer initialPrice) {
		this.initialPrice = initialPrice;
		setChanged();
		notifyObservers();
	}

	public Integer getFinalCalculatedPrice() {
		return finalCalculatedPrice;
	}

	public void setFinalCalculatedPrice(Integer finalCalculatedPrice) {
		this.finalCalculatedPrice = finalCalculatedPrice;
		setChanged();
		notifyObservers(finalCalculatedPrice);
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object arg) {
		super.notifyObservers(arg);
	}

	
}
