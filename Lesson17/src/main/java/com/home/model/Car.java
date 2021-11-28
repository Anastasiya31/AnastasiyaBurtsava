package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Car {
    private String number;
    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", year=" + year +
                '}';
    }
}