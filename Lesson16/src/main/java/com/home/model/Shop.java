package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class Shop {
    private ArrayList<Product> products;

    public void addProduct(Product product) {
        products.removeIf(product1 -> product.getId() == product1.getId());
        products.add(product);
    }

    public ArrayList<Product> getListProducts(ArrayList<Product> pr) {
        return products;
    }

    public void remove(int id) {
        products.removeIf(product -> product.getId() == id);
    }
}
