package com.home.service;

import com.home.service.car.Car;

import java.io.*;

public class StreamsUtils {

    private StreamsUtils() {
    }

    public static String input(String fileInputName) throws IOException {
        StringBuilder builder = new StringBuilder();
        char[] buff = new char[1024];
        FileReader reader = new FileReader(fileInputName);
        int read;
        while ((read = reader.read(buff)) > -1) {
            builder.append(buff, 0, read);
        }
        String text = builder.toString();
        reader.close();
        return text;
    }

    public static void first(String fileInputName, String fileOutputName) throws IOException {
        input(fileInputName);
        FileWriter writer = new FileWriter(fileOutputName);
        writer.write(TextFormatter.getPalindromes(input(fileInputName)));
        writer.close();
    }

    public static void second(String fileInputName, String fileOutputName) throws IOException {
        input(fileInputName);
        FileWriter writer = new FileWriter(fileOutputName);
        writer.write(TextFormatter.formatText(input(fileInputName)));
        writer.close();
    }

    public static void third(String fileInputName, String fileOutputName) throws IOException {
        input(fileInputName);
        input(fileOutputName);
        TextFormatter.checkCensor(input(fileInputName), input(fileOutputName));
    }

    public static void serializationCar(Car car, String fileName) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(car);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        System.out.println(ois.readObject());
        ois.close();
    }
}
