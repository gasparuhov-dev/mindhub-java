package vendingMachene;

import java.util.Collection;
import java.util.HashMap;

public class CoffeeVendingMachine {
	private double turnover;
	protected HashMap<String,Integer> containers;
	protected final int capacity = 5000;
	public CoffeeVendingMachine(Collection<String> ingredients) {
		turnover=0;
		containers = new HashMap<String, Integer>();
		for(String ingedient: ingredients) {
			containers.put(ingedient, capacity);
		}
	}
	
	public void resupplyContainer(String ingredient){
		if(containers.containsKey(ingredient)) {
			containers.put(ingredient, capacity);
		}
	}
	
	public void resupply() {
		for(String key: containers.keySet()) {
			resupplyContainer(key);
		}
	}
	
	public int getIngerdientSupply(String ingredient){
		if(!containers.containsKey(ingredient)) {
			throw new RuntimeException("There is no container with this ingredient");
		}
		return containers.get(ingredient);
	}
	
	public void useIngredient(String ingredient, int amount){
		if(!containers.containsKey(ingredient)) {
			throw new RuntimeException("There is no container with this ingredient");
		}
		if(containers.get(ingredient)<amount) {
			throw new RuntimeException("Not enough ingredinet to get that amount");
		}
		containers.put(ingredient, containers.get(ingredient)-amount);
	}
	
	public void brewRecipe(Recipe recipe){
		for(String ingredient : recipe.getIngredients().keySet()) {
			useIngredient(ingredient,recipe.getIngredients().get(ingredient));
		}
		this.turnover+=recipe.getPrice();
	}
	

	
}
