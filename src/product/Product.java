package product;

import java.util.Objects;

public class Product {
    private String productName;
    private Double productPrice;
    private Double weight;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isBlank() || productName.isBlank()){
            throw new IllegalArgumentException("Заполните карточку полностью");
        }else {
            this.productName= productName;
        }
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        if (productPrice == null || productPrice <= 0){
            throw new IllegalArgumentException("Заполните карточку полностью");
        }else {
            this.productPrice = productPrice;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        if (weight == null || weight == 0){
            throw new IllegalArgumentException("Заполните карточку полностью");
        }else {
            this.weight= weight;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return  productName + ", "
                + productPrice + ", "
                + weight;
    }

    public Product(String productName, Double productPrice, Double weight) {
        setProductName(productName);
        setProductPrice(productPrice);
        setWeight(weight);
    }

}
