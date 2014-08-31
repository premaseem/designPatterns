package com.premaseem.decorator.basecoffee;

import com.premaseem.decorator.AbstractCoffeRoot;

public class ColdCoffe extends AbstractCoffeRoot {

	public ColdCoffe(){
		setName("Cold Coffee ");
		setDescription("Cold coffee with - ");
	}
	
	@Override
	public Double getCost() {
		return 12.0;
	}
}
