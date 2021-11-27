package com.home.service;

import com.home.model.Application;
import com.home.model.Product;
import com.home.model.Shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Машинка", 10);
        Product p2 = new Product(2, "Кукла", 16);
        Product p3 = new Product(4, "Мишка", 15);
        ArrayList<Product> products = new ArrayList<>();
        Shop shop = new Shop(products);

        shop.addProduct(p1);
        shop.addProduct(p2);
        shop.addProduct(p3);

        Application application = new Application();
        application.menu(shop);


    }
}
