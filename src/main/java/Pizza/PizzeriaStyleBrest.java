package main.java.Pizza;

public class PizzeriaStyleBrest extends Pizzeria {

	@Override
	public Pizza creerPizza(String type) {
		Pizza pizza;

		if (type.equals("fromage")) {
			pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecqueStyleBrest();
		} else {
			pizza = new PizzaPoivronsStyleBrest();
		}
		return pizza;
	}

}
