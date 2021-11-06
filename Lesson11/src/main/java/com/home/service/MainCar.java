package com.home.service;

import com.home.model.Car;
import com.home.model.WrongStartException;

public class MainCar {
    public static void main(String[] args) {

        CarServiceImpl car = new CarServiceImpl(new Car("Audi", 2019, 45000));
        CarServiceImpl car2 = new CarServiceImpl(new Car("Nissan", 2020, 25000));
        CarServiceImpl car3 = new CarServiceImpl(new Car("BMW", 2021, 35000));

        try {
            car.start();
            car2.start();
            car3.start();

        } catch (WrongStartException e) {
            e.printStackTrace();
        }
    }
}
