package com.premaseem.abstractFactory;

public class PizzaStore {

	public Pizza orderPizza(String pizzafactory, String pizzaType) {
		// TODO Auto-generated method stub
		AbstracePizzaFactory pizzaFactory = getPizzaFactory(pizzafactory);
		Pizza pizza = pizzaFactory.getPizzaBase(pizzaType);
		bakePizza();
		deliverPizza();
		return pizza;
	}

	private AbstracePizzaFactory getPizzaFactory(String pizzafactory) {
		if (pizzafactory.equalsIgnoreCase("Jain")) {
			return new JainPizzaFactory();
		} else if (pizzafactory.equalsIgnoreCase("General")) {
			return new GeneralPizzaFactory();
		}

		return new GeneralPizzaFactory();
	}

	private void deliverPizza() {
		// TODO Auto-generated method stub

	}

	private void bakePizza() {
		// TODO Auto-generated method stub

	}
}
