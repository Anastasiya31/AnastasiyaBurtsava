package com.home.service.car;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Car implements Serializable {

    private String brand;
    private Engine engine;
    private GasolineTank gasolineTank;
    private int speed;
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", gasolineTank=" + gasolineTank +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
