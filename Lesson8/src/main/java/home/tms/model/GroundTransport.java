package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class GroundTransport extends Transport {
    private int numberOfWheels;
    private int fuelConsumption;

    @Override
    public String info() {
        return super.info() + ",\nколичество колёс = " + numberOfWheels + ", расход топлива = " + fuelConsumption + "(л/100км)";
    }
}
