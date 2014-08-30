package com.premaseem.javaapi.observable;

import java.util.Observable;

public class ObservableShare extends Observable {

	Integer shareprice = 0;
	
	public Integer getShareprice() {
		return shareprice;
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	public void setShareprice(Integer shareprice) {
		System.out.println("updating price changein subject ");
		this.shareprice = shareprice;
		super.setChanged();
		super.notifyObservers();
	}
}
