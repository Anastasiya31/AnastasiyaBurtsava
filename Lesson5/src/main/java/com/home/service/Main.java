package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel", 5, "blue", 0);
        Computer computer2 = new Computer("Intel3", 4, "black", 5);

        System.out.println(computer);
        computer.on();
        System.out.println(computer2);
        computer2.on();
    }
}
