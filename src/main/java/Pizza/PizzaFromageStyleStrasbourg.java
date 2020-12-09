package main.java.Pizza;

public class PizzaFromageStyleStrasbourg extends Pizza{

	public PizzaFromageStyleStrasbourg() {
		super.nom = "pâte style Strasbourg et fromage";
		super.garnitures.add("Mozzarella en lamelles");
	}

	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}
	
	
	
}
