package com.margieblair.ConsoleGames.Hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/margueriteblair/Downloads/words_alpha.txt"));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
