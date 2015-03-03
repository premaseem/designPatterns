package com.premaseem.decorator;

public abstract class AbstractCoffeRoot {

	String description = " Coffee root ";
	String name = "undefined ";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public abstract Double getCost(); 
}
// sirni is makes some chages here 
