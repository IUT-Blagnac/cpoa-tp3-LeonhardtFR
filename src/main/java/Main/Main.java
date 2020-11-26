package main.java.Main;

import main.java.Fabrique.PizzeriaFactory;
import main.java.Pizza.Pizza;
import main.java.Pizza.Pizzeria;

public class Main {

	public static void main(String[] args) {
		
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().creer("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().creer("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getNom() + "\n");
		
	}

}
