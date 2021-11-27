package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Товар: " +
                "id=" + id +
                ", название='" + name + '\'' +
                ", цена=" + price + ";";
    }
}
