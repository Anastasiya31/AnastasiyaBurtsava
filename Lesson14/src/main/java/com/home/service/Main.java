package com.home.service;

import com.home.service.car.Car;
import com.home.service.car.Engine;
import com.home.service.car.GasolineTank;

import java.io.IOException;

public class Main {
    private static final String OUTPUT_FILE1 = "Lesson14/src/main/java/com/home/service/hw1/output.txt";
    private static final String INPUT_FILE1 = "Lesson14/src/main/java/com/home/service/hw1/input.txt";
    private static final String OUTPUT_FILE2 = "Lesson14/src/main/java/com/home/service/hw2/output.txt";
    private static final String INPUT_FILE2 = "Lesson14/src/main/java/com/home/service/hw2/input.txt";
    private static final String INPUT_FILE3 = "Lesson14/src/main/java/com/home/service/hw3/input.txt";
    private static final String CENSOR_FILE3 = "Lesson14/src/main/java/com/home/service/hw3/censor.txt";
    private static final String INPUT_FILE4 = "Lesson14/src/main/java/com/home/service/hw4/input1.txt";


    public static void main(String[] args) {

        Car car = new Car("BMW", new Engine("ddd", 55), new GasolineTank("aaa", 10), 150, 100000);

        try {
            StreamsUtils.first(INPUT_FILE1, OUTPUT_FILE1);
            StreamsUtils.second(INPUT_FILE2, OUTPUT_FILE2);
            System.out.println("Цензура");
            StreamsUtils.third(INPUT_FILE3, CENSOR_FILE3);
            System.out.println("Сериализация");
            StreamsUtils.serializationCar(car, INPUT_FILE4);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

