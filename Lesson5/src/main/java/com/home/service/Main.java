package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 6, "wd blue", 5);
        System.out.println(computer.toString());
        computer.on();
    }
}
