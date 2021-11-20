package com.home.service.car;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
public class Engine implements Serializable {
    private String typeEngine;
    private transient int numberCylinders;

    @Override
    public String toString() {
        return "Engine{" +
                "typeEngine='" + typeEngine + '\'' +
                ", numberCylinders=" + numberCylinders +
                '}';
    }
}
