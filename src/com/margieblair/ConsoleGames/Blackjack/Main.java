package com.margieblair.ConsoleGames.Blackjack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        Deck deck = new Deck();
        deck.shuffle();
        Player margie = new Player();
        System.out.println("You just drew a: ");
        margie.drawCard(deck);

    }


}
