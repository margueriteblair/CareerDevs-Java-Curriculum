package com.margieblair.ConsoleGames.Blackjack;

import java.util.ArrayList;
import java.util.List;

public interface Actor {
    List<Card> hand = new ArrayList<>();

    public void drawCard(Deck deck);
}
