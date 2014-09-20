package com.premaseem.bridgePattern.shape;

public interface ShapeAPI {

	public void drawCircle();

	public void drawRectangle();

	public void drawOval();

}

class GreenShapeAPI implements ShapeAPI {

	@Override
	public void drawCircle() {
		System.out.println("drawing circle " + this.getClass().getSimpleName());
	}

	@Override
	public void drawRectangle() {
		System.out.println("drawing  " + this.getClass().getSimpleName());
	}

	@Override
	public void drawOval() {
		System.out.println("drawing circle " + this.getClass().getSimpleName());
	}
}

class BlueShapeAPI implements ShapeAPI {

	@Override
	public void drawCircle() {
		System.out.println("drawing circle " + this.getClass().getSimpleName());
	}

	@Override
	public void drawRectangle() {
		System.out.println("Yet to implement");
	}

	@Override
	public void drawOval() {
		System.out.println("Do not support ");
	}
}