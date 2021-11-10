package com.home.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Car {
    private String brand;
    private int yearOfMade;
    private int distance;

    public Car(String brand, int yearOfMade, int distance) {
        this.brand = brand;
        this.yearOfMade = yearOfMade;
        this.distance = distance;
    }
}
