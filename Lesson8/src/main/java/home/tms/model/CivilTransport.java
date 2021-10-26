package home.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class CivilTransport extends AirTransport {
    private int numberOfPassengers;
    private boolean availabilityBusinessClass;

    @Override
    public String info() {
        return super.info() + ",\nкол-во пассажиров = " + numberOfPassengers + ", наличие бизнес класса - " + availabilityBusinessClass;
    }

    public void checkCapacity(int passengers) {
        if (passengers <= numberOfPassengers) {
            System.out.println("Самолёт загружен");
        } else {
            System.out.println("Вам нужен самолёт побольше");
        }
    }
}
