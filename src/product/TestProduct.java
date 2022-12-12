package product;

public class TestProduct {
    public static void main(String[] args) {
        ListOfProduct listOfProduct = new ListOfProduct();
        Product tomato = new Product("tomato", 4.2, 1.2);;
        Product banana = new Product("banana", 4.7, 1.7);

        listOfProduct.addProduct(tomato);
        listOfProduct.addProduct(banana);
        //listOfProduct.addProduct(banana);

        System.out.println(listOfProduct);
    }
}