package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Car {
    private String name;
    private int yom;
    private int distance;
    private int distanceFuel;
    private int count = 0;
    private boolean onEngine;
    private boolean onCar;
    private boolean fuels;
    private boolean coveredDistance;
    private Scanner sc = new Scanner(System.in);

    public void startCar() {
        if (onEngine == true && fuels == true) {
            System.out.println("Машина заведена");
            onCar = true;
        } else if (onEngine == true && fuels == false) {
            System.out.println("Бак пуст, машину завести нельзя");
        } else if (onEngine == false && fuels == true) {
            System.out.println("Двигатель не заведён, машину завести нельзя");
        } else {
            System.out.println("Машину завести нельзя");
        }
    }

    public void ride() {
        if (onCar == true) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не заведена, не может ехать, ");
        }
        count++;
    }

    public void shutOff() {
        System.out.println("Машина заглушена и проехала " + distance + "км");
        onCar = false;
        onEngine = false;
        coveredDistance = true;
    }

    public int allDistance() {
        return distance * count;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public class Engine {
        private String typeEngine;
        private int enginePower;

        public void startEngine() {
            System.out.println("Двигатель заведен");
            onEngine = true;
        }
    }

    @Getter
    @AllArgsConstructor
    public class GasolineTank {
        private int volumeTank;
        private int fuelQuantity;

        public int fuelNow() {
            if (coveredDistance == true) {
                return fuelQuantity -= distanceFuel;
            } else {
                return fuelQuantity;
            }
        }

        public void isFull() {
            fuelNow();
            if (fuelQuantity >= distanceFuel && fuelQuantity < volumeTank) {
                System.out.println("В баке есть топливо " + fuelQuantity);
                fuels = true;
            } else if (fuelQuantity > volumeTank) {
                System.out.println("Бак переполнен");
            } else {
                System.out.println("Бак пуст");
            }
        }

        public int fullUp() {
            fuelNow();
            System.out.println("Заправте машину ");
            int n = sc.nextInt();
            if (n > volumeTank - fuelQuantity) {
                System.out.println("Слишком много");
                n = sc.nextInt();
            }
            if (fuelQuantity < volumeTank && fuelQuantity > 0) {
                fuelQuantity += n;
                System.out.println("Заправлено, в баке " + fuelQuantity);
                return fuelQuantity += n;
            }
            return fuelQuantity;
        }

        public int fuelLeft() {
            return fuelQuantity - distanceFuel;
        }
    }
}
