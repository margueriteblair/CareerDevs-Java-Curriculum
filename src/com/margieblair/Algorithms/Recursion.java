package com.margieblair.Algorithms;

public class Recursion {
    public static void main(String[] args) {
        countdownRecursive(5);
    }

    public static void countdownIterative(int n) {
        while (n > 0) {
            System.out.println(n);
            n--;
        }
    }

    //n = 1
    public static void countdownRecursive(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n); //print 1
        countdownRecursive(n-1); //countdownRecursive(1)
    }
}
