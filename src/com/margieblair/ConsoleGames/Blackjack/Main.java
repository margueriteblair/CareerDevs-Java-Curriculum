package com.margieblair.ConsoleGames.Blackjack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        Card testCard = new Card(Suit.DIAMONDS, 3);
        Card queenHearts = new Card(Suit.HEARTS, 12);
        Card aceClubs = new Card(Suit.CLUBS, 1);
        System.out.println(testCard.toString());
        System.out.println(queenHearts.toString());
        System.out.println(aceClubs.toString());

    }


}
