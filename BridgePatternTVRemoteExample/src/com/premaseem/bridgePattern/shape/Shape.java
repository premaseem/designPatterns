package com.premaseem.bridgePattern.shape;

public abstract class Shape {

	protected ShapeAPI shapeApi;
	
	public  Shape(ShapeAPI shapeApi){
		this.shapeApi = shapeApi;
	}
	
	abstract void draw();
	void color(){
		System.out.println("coloring the shape " + getShape());
	}
	abstract Shape getShape();
}

class Circle extends Shape{

	public Circle(ShapeAPI shapeApi) {
	    super(shapeApi);
    }

	@Override
    void draw() {
		shapeApi.drawCircle();
    }

	@Override
    Shape getShape() {
	    return this;
    }
}

class Rectangle extends Shape{

	public Rectangle(ShapeAPI shapeApi) {
	    super(shapeApi);
    }

	@Override
    void draw() {
		shapeApi.drawRectangle();
    }

	@Override
    Shape getShape() {
	    return this;
    }
}