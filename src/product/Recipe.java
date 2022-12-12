package product;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
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

    public Set<Recipe> getRecipes() {
        return recipes;
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

    public void addRecipe(Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Такой рецепт уже есть в списке");
        }else {
            recipes.add(recipe);
        }
    }

    public Recipe(ListOfProduct listOfProduct, Double cost, String recipeName, Set<Recipe> recipes) {
        this.listOfProduct = listOfProduct;
        this.cost = cost;
        this.recipeName = recipeName;
        this.recipes = recipes;
    }
}
