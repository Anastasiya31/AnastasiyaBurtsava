package com.home.service.car;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Setter
public class GasolineTank implements Serializable {
    private String typeFuels;
    private int volume;

    @Override
    public String toString() {
        return "GasolineTank{" +
                "typeFuels ='" + typeFuels + '\'' +
                ", volume=" + volume +
                '}';
    }
}
