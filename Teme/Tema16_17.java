package Teme;

import java.util.ArrayList;
import java.util.List;

public class Tema16_17 { }

    /*-Design a recipe book where you can add recipes, and search for recipes based on ingredients.
class Recipe {
    private String name;
    private List<String> ingredients;
}

-Adaugati in clasa: constructor, getteri, setteri, metoda addRecipe(), metoda public boolean hasIngredient(String ingredient).

-In clasa Main folositi acest array pentru a apela metoda hasIngredient() de mai sus:
List<Recipe> recipesWithMilk = new ArrayList<>(); (edited)

*/
    class Recipe {
        private String name;
        private List<String> ingredients;

        // Constructor
        public Recipe(String name, List<String> ingredients) {
            this.name = name;
            this.ingredients = ingredients;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for ingredients
        public List<String> getIngredients() {
            return ingredients;
        }

        // Setter for ingredients
        public void setIngredients(List<String> ingredients) {
            this.ingredients = ingredients;
        }

        // Method to add a recipe
        public void addRecipe(String name, List<String> ingredients) {
            this.name = name;
            this.ingredients = ingredients;
        }

        // Method to check if the recipe has a specific ingredient
        public boolean hasIngredient(String ingredient) {
            return ingredients.contains(ingredient);
        }
    }

    class Main {
        public static void main(String[] args) {

            List<Recipe> recipes = new ArrayList<>();

            // Adding recipes
            List<String> recipe1Ingredients = new ArrayList<>();
            recipe1Ingredients.add("milk");
            recipe1Ingredients.add("flour");
            Recipe recipe1 = new Recipe("Pancakes", recipe1Ingredients);
            recipes.add(recipe1);

            List<String> recipe2Ingredients = new ArrayList<>();
            recipe2Ingredients.add("eggs");
            recipe2Ingredients.add("milk");
            recipe2Ingredients.add("sugar");
            Recipe recipe2 = new Recipe("French Toast", recipe2Ingredients);
            recipes.add(recipe2);

            // Creating a list to store recipes containing milk
            List<Recipe> recipesWithMilk = new ArrayList<>();

            // Checking for recipes containing milk
            for (Recipe recipe : recipes) {
                if (recipe.hasIngredient("milk")) {
                    recipesWithMilk.add(recipe);
                }
            }

            // Displaying recipes containing milk
            System.out.println("Recipes containing milk:");
            for (Recipe recipe : recipesWithMilk) {
                System.out.println(recipe.getName());
            }
        }
}
