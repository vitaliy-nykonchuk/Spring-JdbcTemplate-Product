package org.example.app.entity;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Product {
    private Integer id;
    private String productName;
    private Integer quota;
    private Double price;

    public Product(){
    }

    public Product(String productName, Integer quota, Double price) {
        this.productName = productName;
        this.quota = quota;
        this.price = price;
    }

    public Product(Integer id, String productName, Integer quota, Double price) {
        this.id = id;
        this.productName = productName;
        this.quota = quota;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productName, product.productName) && Objects.equals(quota, product.quota) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, quota, price);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", " + this.getProductName() +
                ", " + this.getQuota() +
                ", " + this.getPrice() + "\n";
    }
}
