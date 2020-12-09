package main.java.Fabrique;

import main.java.Pizza.Pizzeria;
import main.java.Pizza.PizzeriaStyleBrest;
import main.java.Pizza.PizzeriaStyleStrasbourg;

public class PizzeriaFactory {

	private PizzeriaFactory() {} // constructeur
	
	private static final PizzeriaFactory instance = new PizzeriaFactory();
	
	public static final PizzeriaFactory getInstance() {
		return instance;
	}
	
	public Pizzeria creer(String type) {
		
		Pizzeria pizza;

		if (type.equals("Brest")) {
			pizza = new PizzeriaStyleBrest();
		} else if (type.equals("Strasbourg")) {
			pizza = new PizzeriaStyleStrasbourg();
		} else {
			return null;
		}
		return pizza;
	}

	
}
