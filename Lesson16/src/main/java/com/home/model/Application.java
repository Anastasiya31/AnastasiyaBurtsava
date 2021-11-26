package com.home.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Application {
    private final Scanner scan = new Scanner(System.in);

    public void menu(Shop shop) {
        int x;
        do {
            System.out.println(
                    """
                            Выберете пункт меню:
                            1. Сортировка
                            2. Добавление товара
                            3. Удаление товара
                            4. Редактирование товара
                            5. Показать товары
                            6. Выход
                            """
            );
            x = scan.nextInt();
            if (x > 6) {
                System.out.println("Выберите номнр из списка");
                x = scan.nextInt();
            }
            switch (x) {
                case 1 -> sorting(shop.getProducts());
                case 2 -> addProduct(shop.getProducts());
                case 3 -> removeProduct(shop.getProducts());
                case 4 -> editProduct(shop.getProducts());
                case 5 -> System.out.println(shop.getProducts());
                case 6 -> System.out.println("До свидания!");
            }
        } while (x != 6);
    }

    private void sorting(ArrayList<Product> products) {
        int x;
        System.out.println(
                """
                        Как вы хотите сортировать:
                        1. По цене(возрастание)
                        2. По цене(убывание)
                        3. По добавлению
                        """
        );
        x = scan.nextInt();
        if (x > 3) {
            System.out.println("Нет такого товара");
            x = scan.nextInt();
        }
        switch (x) {
            case 1 -> {
                products.sort(Comparator.comparing(Product::getPrice));
                System.out.println(products);
            }
            case 2 -> {
                products.sort(Comparator.comparing(Product::getPrice, Comparator.reverseOrder()));
                System.out.println(products);
            }
            case 3 -> {
                products.sort(Comparator.comparingInt(products::indexOf));
                //    products.sort(Comparator.comparing(Product::getId));
                System.out.println(products);
            }
        }
    }

    public void addProduct(ArrayList<Product> products) {
        System.out.println("Введите индекс");
        int id = scan.nextInt();
        System.out.println("Введите наименование товара");
        String name = scan.next();
        System.out.println("Введите цену");
        int price = scan.nextInt();
        Product product = new Product(id, name, price);
        products.removeIf(product1 -> product.getId() == product1.getId());
        products.add(product);
        System.out.println(products);
    }

    public void removeProduct(ArrayList<Product> products) {
        System.out.println("Введите id товара, который хотите удалить");
        int id = scan.nextInt();
        if (id > products.size()) {
            System.out.println("Нет такого товара");
            id = scan.nextInt();
        }
        int finalId = id;
        products.removeIf(product -> product.getId() == finalId);
        System.out.println(products);
    }

    public void editProduct(ArrayList<Product> products) {
        System.out.println("Введите id товара, который хотите редактировать");
        int id = scan.nextInt();
        if (id > products.size()) {
            System.out.println("Нет такого товара");
            id = scan.nextInt();
        }
        System.out.println("Введите новое наименование товара");
        String name = scan.next();
        System.out.println("Введите новую цену");
        int price = scan.nextInt();
        products.add(new Product(id, name, price));
        System.out.println(products);
    }
}
