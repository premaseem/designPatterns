package com.premaseem.flyWeight;

abstract public class Star {
	public Star(String name){
		this.name = name;
	}
	String extensricInputcenter;
	
	/**
	 * 
	 */
	String name;
	String getCenter() {
		return extensricInputcenter;
	}

	void setCenter(String center) {
		this.extensricInputcenter = center;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String starColor = "white";
	String size = "big";

	String getStarColor() {
		return starColor;
	}

	abstract void setStarColor(String starColor);

	String getSize() {
		return size;
	}

	abstract void setSize(String size);

	@Override
    public String toString() {
	    return this.getClass().getSimpleName() + " placed at  " + extensricInputcenter +" with color "+ starColor + " and size " + size ;
    }
	
	

}

class SuperNoveStar extends Star {

	public SuperNoveStar(String name) {
	    super(name);
	    // TODO Auto-generated constructor stub
    }

	@Override
	void setStarColor(String starColor) {
		this.starColor = "red";

	}

	@Override
	void setSize(String size) {
		this.size = "huge";
	}

}

class PoleStar extends Star {

	public PoleStar(String name) {
	    super(name);
	    // TODO Auto-generated constructor stub
    }

	@Override
	void setStarColor(String starColor) {
		// TODO Auto-generated method stub
		this.starColor = "while";
	}

	@Override
	void setSize(String size) {
		// TODO Auto-generated method stub
		this.size = "medium";
	}

}

class DraughStar extends Star {

	public DraughStar(String name) {
	    super(name);
	    // TODO Auto-generated constructor stub
    }

	@Override
	void setStarColor(String starColor) {
this.starColor = "black";
	}

	@Override
	void setSize(String size) {
		this.size = "small";
	}

}
