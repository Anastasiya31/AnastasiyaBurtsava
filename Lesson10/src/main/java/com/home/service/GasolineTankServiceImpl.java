package com.home.service;

import com.home.model.GasolineTank;
import com.home.utils.CarUtils;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

import static com.home.utils.CarUtils.*;

@Getter
@Setter
public class GasolineTankServiceImpl implements GasolineTankService {
    private GasolineTank gasolineTank;
    private Scanner sc = new Scanner(System.in);

    public GasolineTankServiceImpl(GasolineTank gasolineTank) {
        this.gasolineTank = gasolineTank;
    }

    @Override
    public void checkFuelTank() {
        if (coveredDistance && gasolineTank.getFuelQuantity() <= gasolineTank.getVolumeTank()) {
            gasolineTank.setFuelQuantity(gasolineTank.getFuelQuantity() - gasolineTank.getDistanceFuel());
            System.out.println("В баке = " + gasolineTank.getFuelQuantity());
            fuels = true;
        } else if (gasolineTank.getFuelQuantity() <= gasolineTank.getVolumeTank() &&
                gasolineTank.getFuelQuantity() >= gasolineTank.getDistanceFuel()) {
            System.out.println("Топливо есть " + gasolineTank.getFuelQuantity());
            fuels = true;
        } else {
            System.out.println("Бак пуст");
        }
    }

    @Override
    public void refuel() {
        System.out.println("Заправте машину ");
        int n = sc.nextInt();
        if (n > gasolineTank.getVolumeTank() - gasolineTank.getFuelQuantity()) {
            System.out.println("Слишком много, бак переполнен");
            n = sc.nextInt();
        }
        if (gasolineTank.getFuelQuantity() > 0 && gasolineTank.getFuelQuantity() < gasolineTank.getVolumeTank()) {
            gasolineTank.setFuelQuantity(gasolineTank.getFuelQuantity() + n);
            System.out.println("Заправлено, в баке " + gasolineTank.getFuelQuantity());
        }
    }
}


