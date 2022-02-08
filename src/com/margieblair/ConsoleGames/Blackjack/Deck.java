package com.margieblair.ConsoleGames.Blackjack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private final static int[] RANKS = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    public Deck() {
        this.deck = new ArrayList<>();
        for (int i = 0; i < RANKS.length; i++) { //all of our ranks range from 1 - 13
            for (Suit s : Suit.values()) {
                // {KEY:VALUE, KEY2, VAL2...}
                // DO YOU WANT TO ITERATE OVER A) THE KEYS, B) THE VALUES, C) BOTH
                deck.add(new Card(s, RANKS[i]));
                System.out.println(deck.get(deck.size()-1));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public List<Card> getCards() {
        return deck;
    }
    // List<Card> arrList = new ArrayList<>();
    // ArrayList<Card> arrList = new ArrayList<>();

}
