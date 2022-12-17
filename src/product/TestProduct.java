package product;

import collection.CollectionClass;

public class TestProduct {
    public static void main(String[] args) {
        ListOfProduct listOfProduct = new ListOfProduct();
        Product tomato = new Product("tomato", 4.2, 0.1);
        ;
        Product banana = new Product("banana", 4.7, 0.3);
        Product bread = new Product("bread", 1.5, 1.0);
        Product cheese = new Product("cheese", 3.7, 1.0);

        listOfProduct.addProduct(tomato);
        listOfProduct.addProduct(banana);
        listOfProduct.addProduct(bread);
        //listOfProduct.addProduct(banana);

        Recipe sandwich = new Recipe();
        sandwich.setRecipeName("Sandwich");
        sandwich.addProductToRecipe(tomato, 3);
        sandwich.addProductToRecipe(bread, 2);
        sandwich.addProductToRecipe(cheese, 0);

        sandwich.countPrice(sandwich);
        System.out.println();
    }
}