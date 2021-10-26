package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int numberOfPassengers;

    @Override
    public String info() {
        return super.info() + ",\nтип кузова - " + bodyType + ", кол-во пассажиров = " + numberOfPassengers;
    }

    public void times(double time) {
        double km;
        km = time * getMaxSpeed();
        double liter;
        liter = getFuelConsumption() * km / 100;
        System.out.println("За время " + time + "ч, автомобиль " + getBrand() +
                ", двигаясь с максимальной скоростью " + getMaxSpeed() + "км/ч\n" +
                "проедет " + km + "км и израсходует " + liter + " литров топлива.");
    }
}