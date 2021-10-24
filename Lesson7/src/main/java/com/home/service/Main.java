package com.home.service;

import com.home.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car.Engine engine1 = car1.new Engine("ggg", 4);
        Car.GasolineTank gasolineTank1 = car1.new GasolineTank(50, 45, 10);

        car1.setDistance(130);

        engine1.startEngine();
        gasolineTank1.isFull();
        car1.startCar();
        car1.ride();
        car1.shutOff();
        engine1.startEngine();
        gasolineTank1.isFull();
        gasolineTank1.fullUp();
        System.out.println("Осталось топлива - " + gasolineTank1.fuelLeft());
        car1.startCar();
        car1.ride();
        car1.shutOff();
        System.out.println("Пройденная дистанция - " + car1.allDistance());
        engine1.startEngine();
        gasolineTank1.isFull();
        gasolineTank1.fullUp();
        System.out.println("Осталось топлива - " + gasolineTank1.fuelLeft());
        car1.startCar();
        car1.ride();
        car1.shutOff();
        System.out.println("Пройденная дистанция - " + car1.allDistance());
        System.out.println("Осталось топлива - " + gasolineTank1.fuelLeft());
    }
}
