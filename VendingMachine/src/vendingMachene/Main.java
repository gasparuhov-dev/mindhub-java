package vendingMachene;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Recipe> recipes = ReadFiles(args);
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("coffee");
		ingredients.add("milk");
		SmartCoffeeVendingMachine scm = new SmartCoffeeVendingMachine(ingredients);
		scm.brewRecipe(recipes.get(0));
		scm.brewRecipe(recipes.get(0));
		scm.brewRecipe(recipes.get(1));
	}

	public static List<Recipe> ReadFiles(String[] args) throws Exception {
		List<Recipe> output = new ArrayList<Recipe>();

		File file = new File(args[0]);
		File[] listFiles = file.listFiles();
		for (File f : listFiles) {

			Path path = Path.of(f.getAbsolutePath());
			
			try {
				List<String> lines = Files.readAllLines(path);
				String[] line = lines.get(0).split(";");
				Recipe recipe = new Recipe(f.getName().split("[.]", 0)[0], Double.parseDouble(line[0]));
				
				for (int i = 1; i < line.length; i++) {
					String[] ingr = line[i].split(",");
					recipe.addIngerdients(ingr[0], Integer.parseInt(ingr[1]));
				}
				
				output.add(recipe);
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return output;
	}
}
