package com.margieblair.ConsoleGames.Blackjack;

public class Card {
    //Cards have two main properties: Suit, Rank
    //Suit: Diamonds, Clubs, Hearts, Spades
    //Rank: Ace, 2, 3...10, Jack, Queen, King
    //we need to make our own specific enum for Suit!
    private Suit suit;
    private int rank; //1 = ace, 11 = jack, 12 = queen, 13=king

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strRank = "";
        switch (rank) {
            case 1 -> strRank = "Ace";
            case 11 -> strRank = "Jack";
            case 12 -> strRank = "Queen";
            case 13 -> strRank = "King";
            default -> strRank = Integer.toString(rank);

        }
        return "This is the " + strRank + " of " + this.suit;
    }
}
