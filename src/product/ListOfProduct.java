package product;

import java.util.HashSet;
import java.util.Set;

public class ListOfProduct {
    private Set<Product> products = new HashSet<>();

    public void addProduct(Product product){
        if (products.contains(product)){
            throw new IllegalArgumentException("Такой продукт уже есть в списке");
        }else {
            products.add(product);
        }
    }

    public void deleteProduct(Product product){
            products.remove(product);
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
