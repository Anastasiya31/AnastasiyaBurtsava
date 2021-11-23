package com.home.service;

import com.home.service.car.CarSerializable;
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
    private static final String INPUT_FILE5 = "Lesson14/src/main/java/com/home/service/hw5/car.json";

    public static void main(String[] args) {

        CarSerializable car = new CarSerializable("BMW", new Engine("ddd", 55), new GasolineTank("aaa", 10), 150, 100000);

        try {
            StreamsUtils.filePalindromes(INPUT_FILE1, OUTPUT_FILE1);
            StreamsUtils.fileFormat(INPUT_FILE2, OUTPUT_FILE2);
            System.out.println("Цензура");
            StreamsUtils.checkCensorFile(INPUT_FILE3, CENSOR_FILE3);
            System.out.println("Сериализация");
            StreamsUtils.serializationCar(car, INPUT_FILE4);

            StreamsUtils.readWriteToJSON(INPUT_FILE5);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

