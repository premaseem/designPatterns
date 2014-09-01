package com.premaseem.factorymethod1;

public interface Vehicle {

	void drive();
	void clean();
	
}

class Car implements Vehicle{

	@Override
    public void drive() {
	    // TODO Auto-generated method stub
	    System.out.println("Driving a Porche Car");
    }

	@Override
    public void clean() {
	    // TODO Auto-generated method stub
	    
    }
	
}

class Bus implements Vehicle{

	@Override
    public void drive() {
	    // TODO Auto-generated method stub
		System.out.println("Driving a Volvo Bus");
	    
    }

	@Override
    public void clean() {
	    // TODO Auto-generated method stub
	    
    }
	
}