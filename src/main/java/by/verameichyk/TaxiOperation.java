package by.verameichyk;

import by.verameichyk.carHierarchy.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TaxiOperation {

    public static int getTaxiPrice(List<Car> cars){
        int sum = 0;
        for (Car car : cars) {
           sum = sum + car.getPrice();
        }
        return sum;
    }

    static List<Car> sortByFuelConsumption(List<Car> cars){
        return cars.stream()
                .sorted(Comparator.comparing(Car::getFuelConsumption))
                .collect(Collectors.toList());
    }
    static List<Car> filterBySpeedValue(List<Car> cars, int minSpeed, int maxSpeed){
        return cars.stream()
                .filter(car -> (car.getSpeed() >= minSpeed && car.getSpeed() <= maxSpeed))
                .collect(Collectors.toList());

    }
    public static void printCars(List<Car> arg) {
        arg.forEach(System.out::println);
        System.out.println();
    }
}

