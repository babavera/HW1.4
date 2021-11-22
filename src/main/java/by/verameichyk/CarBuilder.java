package by.verameichyk;


import by.verameichyk.carHierarchy.Car;
import by.verameichyk.carHierarchy.cargo.CargoTaxi;
import by.verameichyk.carHierarchy.passanger.BodyType;
import by.verameichyk.carHierarchy.passanger.PassengerTaxi;

import java.util.List;

public class CarBuilder {

    public static List<Car> getPassengerTaxiList() {
        return List.of(
                new PassengerTaxi(1, "Audi", "A1", "manual", "diesel", 7.2, 175, 8900,  BodyType.HATCHBACK, 3),
                new PassengerTaxi(2, "Audi", "A3", "automatic", "petrol", 8.2, 185, 11300,  BodyType.HATCHBACK, 4),
                new PassengerTaxi(3, "Audi", "A3", "manual", "petrol", 7.8, 190, 10800,  BodyType.HATCHBACK, 4),
                new PassengerTaxi(4, "Audi", "A4", "manual", "diesel", 8.2, 210, 14900, BodyType.SEDAN, 4),
                new PassengerTaxi(5, "Audi", "A6", "automatic", "petrol", 7.9, 210, 15300, BodyType.WAGON, 4),
                new PassengerTaxi(6, "Audi", "Q7", "automatic", "petrol", 11.2, 220, 25500, BodyType.WAGON, 6),
                new PassengerTaxi(7, "WV", "Multivan", "automatic", "diesel", 9.5, 200, 28500, BodyType.BUS, 8),
                new PassengerTaxi(8, "ГАЗ", "32213", "manual", "gas", 18.5, 140, 6500, BodyType.BUS, 13)
        );
    }

    public static List<Car> getCargoTaxiList() {
        return List.of(
                new CargoTaxi(1, "WV", "Crafter", "manual", "diesel", 10.2, 150, 32300, 3500),
                new CargoTaxi(2, "WV", "Crafter", "automatic", "diesel", 12.0, 140, 35100, 3500),
                new CargoTaxi(3, "WV", "T4 Transporter", "manual", "diesel", 9.5, 180, 12500, 1500)
        );
    }
}





