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
        while (true) {
            System.out.println("Would you like to (1) book a car or (2) return a car or (3) leave dealership:");

            int option = scanner.nextInt();
            if (option == 1) {
                String licenseSelected = scanner.next();
                bookCar(licenseSelected);
            } else if (option == 2) {
                String licenseSelected = scanner.next();
                returnCar(licenseSelected);
            } else if (option == 3) {
                System.out.println("Thanks for coming!");
                break;
            } else  {
                System.out.println("Please select option 1, 2, or 3");
            }
            displayAllCars();
        }

    }

    public static void bookCar(String id) {
        for (int i = 0; i < availableCars.size(); i++) {
            if (id.equals(availableCars.get(i).getLicensePlate())) {
                System.out.println("You've booked " + availableCars.get(i).toString());
                bookedCars.add(availableCars.remove(i));
                break;
            }
        }
    }

    public static void returnCar(String id) {
        for (int i = 0; i < bookedCars.size(); i++) {
            if (id.equals(bookedCars.get(i).getLicensePlate())) {
                System.out.println("You've returned " + bookedCars.get(i).toString());
                availableCars.add(bookedCars.remove(i));
                break;
            }
        }
    }

    public static void displayAllCars()  {
        System.out.println("\nAvailable cars:");
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println(availableCars.get(i).toString());
        }
        System.out.println("Booked cars:");
        for (int i = 0; i < bookedCars.size(); i++) {
            System.out.println(bookedCars.get(i).toString());
        }
    }
}
