package com.home.service;

import com.home.model.Car;
import lombok.Getter;
import lombok.Setter;

import static com.home.utils.CarUtils.*;

@Getter
@Setter
public class CarServiceImpl implements CarService {
    private int count;
    private final EngineServiceImpl engineService;
    private GasolineTankServiceImpl gasolineTankService;
    private Car car;

    public CarServiceImpl(EngineServiceImpl engineService, GasolineTankServiceImpl gasolineTankService, Car car) {
        this.engineService = engineService;
        this.gasolineTankService = gasolineTankService;
        this.car = car;
    }

    @Override
    public void start() {
        if (engineS) {
            System.out.println("Машина заведена");
        } else {
            System.out.println("Машина не заведена");
        }
    }

    @Override
    public void ride() {
        if (engineS) {
            System.out.println("Машина едет");
            carRide = true;
            count++;
        } else {
            System.out.println("Машина не заведена и не может ехать");
        }
    }

    @Override
    public void stop() {
        if (carRide) {
            System.out.println("Машина заглушена и проехала " + car.getDistance() + " км");
            coveredDistance = true;
        } else {
            System.out.println("Машина не проехала");
        }
        fuels = false;
    }

    public void refuelCar() {
        gasolineTankService.refuel();
    }

    @Override
    public void distanceAndFuel() {
        System.out.println("Машина проехала " + car.getDistance() * count + "км и осталось " + gasolineTankService.getGasolineTank().getFuelQuantity() + "л топлива");
    }
}
