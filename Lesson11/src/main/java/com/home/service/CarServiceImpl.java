package com.home.service;

import com.home.model.Car;
import com.home.model.WrongStartException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CarServiceImpl implements CarService {
    private Car car;

    @Override
    public void start() throws WrongStartException {
        int a = (int) (Math.random() * 20);
        if (a % 2 != 0) {
            System.out.println("Автомобиль с маркой " + car.getBrand() + " завёлся");
        } else {
            throw new WrongStartException("Машина " + car.getBrand() + " не завелась :(");
        }
    }
}
