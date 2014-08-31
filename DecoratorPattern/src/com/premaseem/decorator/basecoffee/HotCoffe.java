package com.premaseem.decorator.basecoffee;

import com.premaseem.decorator.AbstractCoffeRoot;

public class HotCoffe extends AbstractCoffeRoot {

	public HotCoffe(){
		setName("Hot Coffee ");
		setDescription(" Hot coffee with - ");
	}
	
	
	@Override
	public Double getCost() {
		return 10.0;
	}

}
