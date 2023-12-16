package vendingMachene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recipe {
	private String name;
	private double price;
	private HashMap<String,Integer> ingredients;
	
	public Recipe(String name, double price) throws Exception {
		if(price<1) {
			throw new Exception("Price can't be, or under 0");
		}
		this.price = price;
		this.name = name;
		this.ingredients = new HashMap<>();
	}
	
	public void addIngerdients(String ingredient, int amount){
		ingredients.put(ingredient,amount);
	}
	public HashMap<String,Integer> getIngredients() {
		return ingredients;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		String output = "Name: " + name+" Price: "+ price;
		for(String str : ingredients.keySet()) {
			output+=" Ingr: "+str+" Ammount: "+ ingredients.get(str);
		}
		return output;
	}
	
}
