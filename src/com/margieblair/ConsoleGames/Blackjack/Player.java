package com.margieblair.ConsoleGames.Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actor {
    private List<Card> hand;
    private String name;
    private int bet;

    public Player(String name, int bet) {
        this.hand = new ArrayList<>();
        this.name = name;
        this.bet = bet;
    }

    @Override
    public void drawCard(Deck deck) {
        this.hand.add(deck.getCards().get(0));
        deck.getCards().remove(0);
    }

    public int displayHand() {
        System.out.println("The current hand for " + this.name + " is");
        int sum = 0;
        for (int i = 0; i < hand.size(); i++) {
            if (this.hand.get(i).getRank() > 10) {
                sum += 10;
            } else if (this.hand.get(i).getRank() == 1) {
                sum += 11; //we need to add logic for making EITHER 1 or 11 based on what the user decides
            } else {
                sum += this.hand.get(i).getRank();
            }
            System.out.println(this.hand.get(i));
        }
        System.out.println("Total " + this.name + " points: " + sum);
        return sum;
    }

    public int getBet() {
        return bet;
    }

    public String getName() {
        return name;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public List<Card> getHand() {
        return hand;
    }
    // interface = "implements"
    // abstract = "extends"

}
