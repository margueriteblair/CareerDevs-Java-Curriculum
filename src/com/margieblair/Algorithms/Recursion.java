package com.margieblair.Algorithms;

public class Recursion {
    public static void main(String[] args) {
        countdownRecursive(5);
        countdownIterative(5);
    }

    public static void countdownRecursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        countdownRecursive(n-1);
    }

    public static void countdownIterative(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }
}
