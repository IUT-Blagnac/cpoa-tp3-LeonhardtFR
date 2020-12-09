package test.java;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import main.java.Pizza.Pizza;
import main.java.Pizza.PizzaFromageStyleBrest;
import main.java.Pizza.PizzaFromageStyleStrasbourg;

public class test {

	@Test
	public void testNomPizzaStrasbourg() {
		Pizza nomPizzaStrasbourg = new PizzaFromageStyleStrasbourg();
		System.out.println(nomPizzaStrasbourg.getNom());
		assertEquals(nomPizzaStrasbourg.getNom(), "pâte style Strasbourg et fromage");
	}
	
	@Test
	public void testNomPizzaBrest() {
		Pizza nomPizzaBrest = new PizzaFromageStyleBrest();
		System.out.println(nomPizzaBrest.getNom());
		assertEquals(nomPizzaBrest.getNom(), "sauce style brest et fromage");
	}
	
}
