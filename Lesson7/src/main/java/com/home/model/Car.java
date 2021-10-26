package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Car {
    private String name = "BMW";
    private int yearOfMade = 2020;
    private int distance = 100;
    private int count = 0;
    private boolean engineStarted;
    private boolean fuels;
    private boolean coveredDistance;
    private Scanner sc = new Scanner(System.in);
    private static Engine engine;

    public Car(Engine engine) {
        Car.engine = engine;
    }

    public void startEngine() {
        if (!fuels) {
            System.out.println("Бак пуст, машину завести нельзя");
        } else {
            System.out.println("Двигатель заведен");
            engineStarted = true;
        }
    }

    public void startCar() {
        if (engineStarted) {
            System.out.println("Машина заведена");
        } else {
            System.out.println("Машину завести нельзя");
        }
    }

    public void ride() {
        if (engineStarted) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не заведена, не может ехать");
        }
        count++;
    }

    public void shutOff() {
        System.out.println("Машина заглушена и проехала " + distance + " км");
        engineStarted = false;
        fuels = false;
        coveredDistance = true;
    }

    public int allDistance() {
        return distance * count;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public class GasolineTank {
        private int volumeTank;
        private int fuelQuantity;
        private int distanceFuel;

        public int fuelNow() {
            if (coveredDistance) {
                return fuelQuantity -= distanceFuel;
            } else {
                return fuelQuantity;
            }
        }

        public void checkFuelTank() {
            fuelNow();
            if (fuelQuantity >= distanceFuel && fuelQuantity < volumeTank) {
                System.out.println("В баке есть топливо " + fuelQuantity);
                fuels = true;
            } else {
                System.out.println("Бак пуст");
            }
        }

        public void refuelCar() {
            if (fuels) {
                System.out.println("Заправте машину ");
                int n = sc.nextInt();
                if (n > volumeTank - fuelQuantity) {
                    System.out.println("Слишком много, бак переполнен");
                    n = sc.nextInt();
                }
                if (fuelQuantity > 0 && fuelQuantity < volumeTank) {
                    fuelQuantity += n;
                    System.out.println("Заправлено, в баке " + fuelQuantity);
                }
            } else {
                System.out.println("Проверте бак");
            }
        }

        public int fuelLeft() {
            if (fuels) {
                return fuelQuantity;
            } else {
                return fuelQuantity - distanceFuel;
            }
        }
    }
}
