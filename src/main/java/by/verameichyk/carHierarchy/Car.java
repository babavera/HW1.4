package by.verameichyk.carHierarchy;

import by.verameichyk.carHierarchy.interfases.AcceptPayment;
import by.verameichyk.carHierarchy.interfases.UseTaximeter;

import java.util.Comparator;

public abstract class Car implements AcceptPayment, UseTaximeter, Comparable<Car> {
    private String brand;
    private String model;
    private String transmission;
    private String fuelType;
    private double fuelConsumption;
    private double maxSpeed;
    private int price;

    public Car(int ID, String brand, String model, String transmission, String fuelType, double fuelConsumption, double maxSpeed, int price) {
        this.brand = brand;
        this.model = model;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getSpeed() {
        return maxSpeed;
    }

    public void setSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Comparator<Car> comparator = Comparator.comparing(Car::getFuelConsumption);

    @Override
    public void useTaximeter(String taximetr) {
        if (taximetr.equals("start")) {
            System.out.println("Taximeter ON");
        }
        if (taximetr.equals("stop")) {
            System.out.println("Taximeter OFF");
        }
    }

    @Override
    public void acceptPayment(double pay) {
        System.out.println("Payment accepted!");

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelType=" + fuelType +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
