package com.home.service;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.service.car.CarSerializable;
import com.home.service.hw5.Car;

import java.io.*;

public class StreamsUtils {

    private StreamsUtils() {
    }

    public static String createReader(String fileInputName) throws IOException {
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

    public static void filePalindromes(String fileInputName, String fileOutputName) throws IOException {
        FileWriter writer = new FileWriter(fileOutputName);
        writer.write(TextFormatter.getPalindromes(createReader(fileInputName)));
        writer.close();
    }

    public static void fileFormat(String fileInputName, String fileOutputName) throws IOException {
        FileWriter writer = new FileWriter(fileOutputName);
        writer.write(TextFormatter.formatText(createReader(fileInputName)));
        writer.close();
    }

    public static void checkCensorFile(String fileInputName, String fileOutputName) throws IOException {
        TextFormatter.checkCensor(createReader(fileInputName), createReader(fileOutputName));
    }

    public static void serializationCar(CarSerializable car, String fileName) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(car);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        System.out.println(ois.readObject());
        ois.close();
    }

    public static void readWriteToJSON(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(MapperFeature.PROPAGATE_TRANSIENT_MARKER, true);
        InputStream is = new FileInputStream(fileName);
        Car car = mapper.readValue(is, Car.class);
        System.out.println(car);
    }
}
