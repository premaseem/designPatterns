package com.premaseem;

public interface CookVisitorI {

	void cook(WeekEndParyHost weekEndParyHost);
	void cook(WeekDayParyHost weekDayParyHost);
	
	
}

class VegCookVisitor implements CookVisitorI{

	@Override
    public void cook(WeekEndParyHost weekEndParyHost) {
		weekEndParyHost.meal = "Spicy Vegetables";
		weekEndParyHost.drink = "Furit Bear";
		weekEndParyHost.music = "DJ music";
		weekEndParyHost.getPartyDetail();	    
    }

	@Override
    public void cook(WeekDayParyHost weekDayParyHost) {
		weekDayParyHost.meal = "Boiled Vegetables";
		weekDayParyHost.drink = "Furit Juice";
		weekDayParyHost.music = "Meditation Music";
		weekDayParyHost.getPartyDetail();	
	    
    }
}

class NonVegCookVisitor implements CookVisitorI{

	@Override
    public void cook(WeekEndParyHost weekEndParyHost) {
		weekEndParyHost.meal = "Spicy chicken";
		weekEndParyHost.drink = " Bear";
		weekEndParyHost.music = "High Beat music";
		weekEndParyHost.getPartyDetail();	    
    }

	@Override
    public void cook(WeekDayParyHost weekDayParyHost) {
		weekDayParyHost.meal = "Non spicy chicken";
		weekDayParyHost.drink = "non alcholic drink";
		weekDayParyHost.music = "normal music";
		weekDayParyHost.getPartyDetail();	
    }
}