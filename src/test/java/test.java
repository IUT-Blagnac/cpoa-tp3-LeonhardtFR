package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Pizza.Pizza;
import main.java.Pizza.PizzaFromageStyleStrasbourg;

public class test {

	@Test
	public void testNomPizza() {
		Pizza pizzaStrasb = new PizzaFromageStyleStrasbourg();
		System.out.println(pizzaStrasb.getNom());
		assertEquals(pizzaStrasb.getNom(), "pâte style Strasbourg et fromage");
	}
}
