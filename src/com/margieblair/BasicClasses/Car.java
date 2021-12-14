package com.margieblair.BasicClasses;

public class Car {
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public Car(String licensePlate, String make, String model, int year) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "" + this.year + " " + this.make + " " + this.model + " with a license plate of " + this.licensePlate;
    }

    //need a getter to get a car by a specific identifier


}
