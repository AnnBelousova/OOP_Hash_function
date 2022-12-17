package product;

import java.util.*;

public class Recipe {
    private Map<Product, Integer> recipe = new HashMap<>();

    ListOfProduct listOfProduct;
    private Double cost;
    private String recipeName;
    private Set<Recipe> recipes = new HashSet<>();

    public ListOfProduct getListOfProduct() {
        return listOfProduct;
    }

    public Double getCost() {
        return cost;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Recipe() {

    }

    public void addProductToRecipe(Product product, Integer quantity) {
        if (product == null){
            recipe.put(product, quantity);
        }
    }

    public void getProductPrice(Product product) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(recipeName, recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }

    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке");
        } else {
            recipes.add(recipe);
        }
    }

    public Recipe(Map<Product, Integer> recipe, String recipeName, Set<Recipe> recipes) {
        this.recipe = recipe;
        this.recipeName = recipeName;
        this.recipes = recipes;
    }

    @Override
    public String toString() {
        return recipe + ", " + recipeName;
    }

    public void countPrice(Recipe recipe) {
        double price = 0;
        Iterator<Map.Entry<Product, Integer>> iterator = recipe.recipe.entrySet().iterator();
        for (int i = 0; ; i++) {
            if (iterator.hasNext()) {
                Map.Entry<Product, Integer> entry = iterator.next();
                if (entry.getValue() >= 1) {
                    price += entry.getKey().getProductPrice() * entry.getValue();
                } else {
                    price += entry.getKey().getProductPrice() * 1;
                }
            }
            break;
        }
        System.out.printf("The total price of %s is %.2f ", recipe.getRecipeName(), price);
    }
}



