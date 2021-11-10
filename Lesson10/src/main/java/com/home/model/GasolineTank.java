package com.home.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GasolineTank {
    private int volumeTank;
    private int fuelQuantity;
    private int distanceFuel;
}
