package com.home.service;

import com.home.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine("ggg", 4);
        Car.GasolineTank gasolineTank = car.new GasolineTank(50, 45, 10);

        car.setName("Mazda");
        car.setYearOfMade(2019);
        car.setDistance(130);

        System.out.println("Машина - " + car.getName() + ", год выпуска - " + car.getYearOfMade());
        gasolineTank.checkFuelTank();
        engine.startEngine();
        car.startCar();
        car.ride();
        car.shutOff();
        engine.startEngine();
        gasolineTank.checkFuelTank();
        gasolineTank.refuelCar();
        System.out.println("Осталось топлива - " + gasolineTank.fuelLeft());
        car.startCar();
        car.ride();
        car.shutOff();
        System.out.println("Пройденная дистанция - " + car.allDistance());
        engine.startEngine();
        gasolineTank.checkFuelTank();
        gasolineTank.refuelCar();
        System.out.println("Осталось топлива - " + gasolineTank.fuelLeft());
        car.startCar();
        car.ride();
        car.shutOff();
        System.out.println("Пройденная дистанция - " + car.allDistance());
        System.out.println("Осталось топлива - " + gasolineTank.fuelLeft());
    }
}
