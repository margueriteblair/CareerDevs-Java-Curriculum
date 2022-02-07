package com.margieblair.ConsoleGames.Blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        for (int i = 1; i <= 13; i++) {
            for (Suit s : Suit.values()) {
                // {KEY:VALUE, KEY2, VAL2...}
                // DO YOU WANT TO ITERATE OVER A) THE KEYS, B) THE VALUES, C) BOTH
                deck.add(new Card(s, i));
                System.out.println(deck.get(deck.size()-1));
            }
        }
    }
    // List<Card> arrList = new ArrayList<>();
    // ArrayList<Card> arrList = new ArrayList<>();

}
