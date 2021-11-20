package com.home.service;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static final String OUTPUT_FILE1 = "Lesson14/src/main/java/com/home/service/hw1/output.txt";
    private static final String INPUT_FILE1 = "Lesson14/src/main/java/com/home/service/hw1/input.txt";
    private static final String OUTPUT_FILE2 = "Lesson14/src/main/java/com/home/service/hw2/output.txt";
    private static final String INPUT_FILE2 = "Lesson14/src/main/java/com/home/service/hw2/input.txt";


    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        char[] buff = new char[1024];
        try (FileReader reader = new FileReader(INPUT_FILE1)) {
            int read;
            while ((read = reader.read(buff)) > -1) {
                builder.append(buff, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = builder.toString();
        String[] offers = text.split("\\s+");
        try (
                FileWriter writer = new FileWriter(OUTPUT_FILE1)) {
            writer.write(TextFormatter.getPalindromes(offers));
        } catch (IOException e) {
            e.printStackTrace();
        }


        StringBuilder builder2 = new StringBuilder();
        char[] buff2 = new char[1024];
        try (FileReader reader = new FileReader(INPUT_FILE2)) {
            int read;
            while ((read = reader.read(buff2)) > -1) {
                builder2.append(buff2, 0, read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text2 = builder2.toString();
        try (
                FileWriter writer = new FileWriter(OUTPUT_FILE2)) {
            writer.write(TextFormatter.formatText(text2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

