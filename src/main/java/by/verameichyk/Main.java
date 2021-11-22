package by.verameichyk;

import by.verameichyk.carHierarchy.Car;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        List<Car> passengerTaxis = CarBuilder.getPassengerTaxiList();

        List<Car> cargoTaxis = CarBuilder.getCargoTaxiList();

        System.out.println("To calculate the cost of a taxi fleet, enter the type of taxi (passenger, " +
                "cargo or all)");

        String taxiType = scan.nextLine().toLowerCase();

        switch (taxiType) {
            case "passenger" -> System.out.println("The cost of a passenger taxi fleet " + TaxiOperation.getTaxiPrice(passengerTaxis) + " $");
            case "cargo" -> System.out.println("The cost of a cargo taxi fleet " + TaxiOperation.getTaxiPrice(cargoTaxis) + " $");
            case "all" -> System.out.println("The cost of the entire taxi fleet " + (TaxiOperation.getTaxiPrice(passengerTaxis) +
                    TaxiOperation.getTaxiPrice(cargoTaxis)) + " $");
            default -> System.out.println("Invalid value entered");
        }
        System.out.println();

        System.out.println("Sorting passenger cars by fuel consumption.");

        List<Car> sortByFuelConsumptionPassengerCar = TaxiOperation.sortByFuelConsumption(passengerTaxis);
        TaxiOperation.printCars(sortByFuelConsumptionPassengerCar);

        System.out.println("Sorting cargo cargo cars by fuel consumption.");

        List<Car> sortByFuelConsumptionCargoCar = TaxiOperation.sortByFuelConsumption(cargoTaxis);
        TaxiOperation.printCars(sortByFuelConsumptionCargoCar);

        System.out.println("Enter the minimum speed value");
        int minSpeed = scan.nextInt();
        System.out.println("Enter the maximum speed value");
        int maxSpeed = scan.nextInt();

        System.out.println("Found cars");

        List<Car> filterBySpeedValuePassenger  = TaxiOperation.filterBySpeedValue(passengerTaxis, minSpeed,maxSpeed);
        TaxiOperation.printCars(filterBySpeedValuePassenger);
        System.out.println();
        List<Car> filterBySpeedValueCargo  = TaxiOperation.filterBySpeedValue(cargoTaxis, minSpeed,maxSpeed);
        TaxiOperation.printCars(filterBySpeedValueCargo);
    }
}




