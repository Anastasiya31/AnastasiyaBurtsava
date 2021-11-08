package com.home.service;

import com.home.model.Car;
import com.home.model.Engine;
import com.home.model.GasolineTank;

public class MainCar {
    public static void main(String[] args) {

        Car car = new Car("gg", 2019, 100);
        EngineServiceImpl engineService = new EngineServiceImpl(new Engine("gg", 10));
        GasolineTankServiceImpl gasolineTankService = new GasolineTankServiceImpl(new GasolineTank(80, 66, 10));
        CarServiceImpl carService = new CarServiceImpl(engineService, gasolineTankService, car);

        gasolineTankService.checkFuelTank();
        engineService.start();
        carService.start();
        carService.ride();
        carService.stop();
        gasolineTankService.checkFuelTank();
        carService.refuelCar();
        engineService.start();
        carService.start();
        carService.ride();
        carService.stop();
        carService.distanceAndFuel();
    }
}

