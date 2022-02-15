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
            // 6 of Diamonds => point = 6
            // jack, queen,king => points 10
            case 1 -> strRank = "Ace"; //1, or 11 points
            case 11 -> strRank = "Jack"; //10
            case 12 -> strRank = "Queen"; //10 all worth 10 pts
            case 13 -> strRank = "King"; //10
            default -> strRank = Integer.toString(rank);

        }
        return "This is the " + strRank + " of " + this.suit;
    }
}
