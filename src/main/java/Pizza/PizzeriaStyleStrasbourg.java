package main.java.Pizza;

public class PizzeriaStyleStrasbourg extends Pizzeria{

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza;

		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleStrasbourg();
		} else {
			pizza = new PizzaPoivronsStyleStrasbourg();
		}
		return pizza;
	}

}
