package by.verameichyk.carHierarchy.passanger;

import by.verameichyk.carHierarchy.Car;
import by.verameichyk.carHierarchy.interfases.TransportPassengers;

public class PassengerTaxi extends Car implements TransportPassengers {

       private final int numberOfPassengers;

    public PassengerTaxi(int ID, String brand, String model, String transmission, String fuelType, double fuelConsumption,
                         double maxSpeed, int price,  BodyType bodyType, int numberOfPassengers) {
        super(ID, brand, model, transmission, fuelType, fuelConsumption, maxSpeed, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public void transportPassengers(int numOfPassengers) {
        if (numOfPassengers <= numberOfPassengers){
            System.out.println("The number of passengers corresponds. Taxi can drive");
        }
    }

    @Override
    public int compareTo(Car o) {
        return (int) (this.getFuelConsumption()-o.getFuelConsumption());
    }
}
