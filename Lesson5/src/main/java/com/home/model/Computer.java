package com.home.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Setter
@Getter
public class Computer {
    private String processor;
    private int ram;
    private String hdd;
    private int period;

    public Computer(String processor, int ram, String hdd, int period) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.period = period;
    }

    public void on() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Внимание! Введите 0 или 1");
        int n = sc.nextInt();
        if (n > 1) {
            System.out.println("Введите 0 или 1");
            n = sc.nextInt();
        }
        Random random = new Random();
        int c = random.nextInt(2);
        if (period != 0) {
            if (n == c) {
                System.out.println("Компьютер включился");
                off();
            } else {
                System.out.println("Компьютер сгорел!");
            }
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    public void off() {
        System.out.println("Компьютер выключен");
        period--;
        if (period == 0) {
            System.out.println("Компьютер сгорел!");
        } else {
            on();
        }
    }

    @Override
    public String toString() {
        return "Компьютер: " +
                "Процессор - '" + processor + '\'' +
                ", оперативка = " + ram + "гб" +
                ", жесткий диск - " + hdd + '\'' +
                ", ресурс полных циклов работы = " + period;
    }
}
