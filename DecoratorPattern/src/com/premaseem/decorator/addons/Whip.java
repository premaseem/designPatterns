package com.premaseem.decorator.addons;

import com.premaseem.decorator.AbstractCoffeRoot;

public class Whip extends AddonsOfCoffee {

	public AbstractCoffeRoot coffee =null;
	
	public Whip(AbstractCoffeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " whip " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.28;
	}

}
