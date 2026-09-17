package dev.lpa;

import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
    }
}
