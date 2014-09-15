package com.premaseem.templateMethod;

public abstract class AbstractBaseJuice {

	/*
	 * This is template method which defines the sequence and steps for prepration. Same thing can be applied inframework like JSF
	 */
	public void prepare() {
		pickUpFruits();
		washFruits();
		pileFruits();
		cutFruits();
		addLiquid();
		operateJuicer();
		decorateJuiceHook();
	}

	abstract String getFruitName();

	abstract void pickUpFruits();

	abstract void addLiquid();

	void washFruits() {
		System.out.println("Washing the fruit ... " + getFruitName());
	}

	void pileFruits() {
		System.out.println("piling the fruit  ... " + getFruitName());
	}

	void cutFruits() {
		System.out.println("cutting the fruit  ... " + getFruitName());
	}

	void operateJuicer() {
		System.out.println("... operate juicer Ghur Ghur Ghur  ... ");
	}

	void decorateJuiceHook() {
		System.out.println("add few dry fruits on top ");
	}
}

class AppleMilkJuice extends AbstractBaseJuice {

	@Override
	String getFruitName() {
		return " Apples ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice prepration ");
	}

	@Override
	void addLiquid() {
		System.out.println("Add Milk in applie milk shake ");
	}
	
	void decorateJuiceHook() {
		System.out.println("decorte with Strawberry on top ");
	}
}

class OrangeJuice extends AbstractBaseJuice {
	@Override
	String getFruitName() {
		return " Orage ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice prepration ");
	}

	@Override
	void addLiquid() {
		System.out.println("Add some water in Orange juice ");
	}
	
	void decorateJuiceHook() {
		System.out.println("decorte with lime slice and straw ");
	}
}

class MixFruitJuice extends AbstractBaseJuice {
	@Override
	String getFruitName() {
		return " Mixfruit ";
	}

	@Override
	void pickUpFruits() {
		System.out.println(getFruitName() + " is picked up for Juice prepration ");
	}

	@Override
	void addLiquid() {
		System.out.println("Adding some flavour  ");
	}
}
