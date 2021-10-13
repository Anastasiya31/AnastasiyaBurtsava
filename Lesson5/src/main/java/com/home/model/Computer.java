package com.home.model;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Computer {
    String processor;
    int ram;
    String hdd;
    static int period;

    public Computer(String processor, int ram, String hdd, int period) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        Computer.period = period;
    }

    @Override
    public String toString() {
        return "Компьютер: " +
                "Процессор - '" + processor + '\'' +
                ", оперативка = " + ram + "гб" +
                ", жесткий диск - " + hdd + '\'' +
                ", ресурс полных циклов работы = " + period;
    }

    public static void on() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внимание! Введите 0 или 1");
        int n = sc.nextInt();
        if (n > 1) {
            System.out.println("Введите 0 или 1");
            n = sc.nextInt();
        }
        Random random = new Random();
        int c = random.nextInt(2);
        if (IntStream.range(0, period).anyMatch(i -> true)) {
            if (n == c) {
                System.out.println("Компьютер включился");
                off();
            } else {
                System.out.println("Компьютер сгорел!");
            }
        }
    }

    public static void off() {
        System.out.println("Компьютер выключен");
        period--;
        if (period == 0) {
            System.out.println("Компьютер сгорел!");
        } else
            on();
    }
}
