package com.premaseem.decorator.addons;

import com.premaseem.decorator.AbstractCoffeRoot;

public class Chokos extends AddonsOfCoffee {

	public AbstractCoffeRoot coffee =null;
	
	public Chokos(AbstractCoffeRoot abstractCoffeRoot){
		this.coffee = abstractCoffeRoot;
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription() + " chokos " ;
	}

	@Override
	public Double getCost() {
		return coffee.getCost() + 0.17;
	}

}
