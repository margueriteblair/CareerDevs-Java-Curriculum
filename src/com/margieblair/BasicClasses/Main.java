package com.margieblair.BasicClasses;

import java.util.*;

public class Main {
    static List<Car> availableCars = new ArrayList<>();
    static List<Car> bookedCars = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        availableCars.add(new Car("QWERTY", "Toyota", "Carola", 2010));
        availableCars.add(new Car("HELLOWRLD", "Ford", "Thunderbird", 1990));
        availableCars.add(new Car("JAVA", "Ford", "ModelT", 1920));
        availableCars.add(new Car("MREEEH", "Honda", "Civic", 2012));

        System.out.println("Welcome to the car dealership! Please select which car you'd like to rent based on the license plate:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(availableCars.get(i).toString());
        }
        String licenseSelected = scanner.next();


    }
}
