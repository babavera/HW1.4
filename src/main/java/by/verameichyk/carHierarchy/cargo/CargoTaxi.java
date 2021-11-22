package by.verameichyk.carHierarchy.cargo;

import by.verameichyk.carHierarchy.Car;
import by.verameichyk.carHierarchy.interfases.TransportGoods;

public class CargoTaxi extends Car implements TransportGoods {
    private int maxWeightOfCargo;

    public CargoTaxi(int ID, String brand, String model, String transmission, String fuelType,
                     double fuelConsumption, double maxSpeed, int price, int maxWeightOfCargo) {
        super(ID, brand, model, transmission, fuelType, fuelConsumption, maxSpeed, price);
        this.maxWeightOfCargo = maxWeightOfCargo;
    }


    public int getMaxWeightOfCargo() {

        return maxWeightOfCargo;
    }

    public void setMaxWeightOfCargo(int maxWeightOfCargo) {

        this.maxWeightOfCargo = maxWeightOfCargo;
    }


    @Override
    public void transportGoods(int weightOfCargo) {
        if (weightOfCargo <= maxWeightOfCargo) {
            System.out.println("The weight of the cargo corresponds. Taxi can go");
        } else {
            System.out.println("The weight of the cargo does not match. Taxi can't go");
        }
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}