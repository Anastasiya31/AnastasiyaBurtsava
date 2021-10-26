package home.tms.service;

import home.tms.model.CivilTransport;
import home.tms.model.FreightTransport;
import home.tms.model.MilitaryTransport;
import home.tms.model.PassengerTransport;

public class Main {
    public static void main(String[] args) {
        PassengerTransport passengerTransport = PassengerTransport.builder()
                .horsepower(10)
                .maxSpeed(150)
                .mass(100)
                .brand("Mazda")
                .numberOfWheels(4)
                .fuelConsumption(10)
                .bodyType("hh")
                .numberOfPassengers(5)
                .build();
        FreightTransport freightTransport = FreightTransport.builder()
                .horsepower(200)
                .maxSpeed(130)
                .mass(10000)
                .brand("МАЗ")
                .numberOfWheels(8)
                .fuelConsumption(18)
                .loadCapacity(7)
                .build();
        CivilTransport civilTransport = CivilTransport.builder()
                .horsepower(200)
                .maxSpeed(130)
                .mass(10000)
                .brand("Boeing")
                .wingspan(2)
                .minRunwayLengthForTakeoff(200)
                .numberOfPassengers(50)
                .availabilityBusinessClass(true)
                .build();
        MilitaryTransport militaryTransport = MilitaryTransport.builder()
                .horsepower(200)
                .maxSpeed(130)
                .mass(10000)
                .brand("МиГ-25")
                .wingspan(2)
                .minRunwayLengthForTakeoff(900)
                .numberMissilesOnBoard(50)
                .existenceEjectionSystem(true)
                .build();

        System.out.println(passengerTransport.info());
        passengerTransport.times(5);

        System.out.println(freightTransport.info());
        freightTransport.checkCapacity(2.5);

        System.out.println(civilTransport.info());
        civilTransport.checkCapacity(45);

        System.out.println(militaryTransport.info());
        militaryTransport.shot();
        militaryTransport.ejection();
    }
}
