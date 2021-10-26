package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Transport {
    private int horsepower;
    private double powerKilowatts;
    private int maxSpeed;
    private int mass;
    private String brand;

    public double conversionKilowatts() {
        powerKilowatts = horsepower * 0.74;
        return powerKilowatts;
    }

    public String info() {
        return "Марка - " + brand +
                ", мощность(в лошадиных силах) = " + horsepower +
                ", мощность(в киловаттах) = " + conversionKilowatts() +
                ", максимальная скорость = " + maxSpeed +
                "(км/ч), масса = " + mass + "(кг)";
    }
}
