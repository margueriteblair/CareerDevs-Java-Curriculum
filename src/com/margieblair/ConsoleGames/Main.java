package com.margieblair.ConsoleGames;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int nextNum = scanner.nextInt();
            try {
                System.out.println("Input a new number:");
                if (nextNum == 100) {
                    System.out.println("Program ending...user input 100");
                    break;
                }
            } catch (Exception e) {
                System.out.println("You can only input a number within Java's bounds of an integer");
                nextNum = -1;
            }

        }
    }
}
