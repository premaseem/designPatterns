package com.premaseem.javaapi.observable;

import java.util.Observable;

public class ObservableGold extends Observable {

	Integer shareprice = 0;
	
	public Integer getShareprice() {
		return shareprice;
	}

	@Override
	public void notifyObservers() {
		super.notifyObservers();
	}

	public void setGoldprice(Integer shareprice) {
		System.out.println("Gold Price chaning ...  ");
		this.shareprice = shareprice;
		super.setChanged();
		super.notifyObservers();
	}
}
