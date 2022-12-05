package com.bridgelabz;

import java.util.Random;
public class DeckOfCards {
    /**
     * Using Four arrays for stored cards
     */
    static String[] Clubs = {"C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9",
            "C10", "CJack", "CQueen", "CKing", "CAce"};

    static String[] Diamonds = {"D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9",
            "D10", "DJack", "DQueen", "DKing", "DAce"};

    static String[] Hearts = {"H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9",
            "H10", "HJack", "HQueen", "HKing", "HAce"};

    static String[] Spades = {"S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9",
            "S10", "SJack", "SQueen", "SKing", "SAce"};

    static String[][] deck = {Clubs, Diamonds, Hearts, Spades};
    static String[][] newDeck;

    /**
     * This is the Static Method is Used for shuffels cards
     */

    public static void distributeCards() {

        newDeck = deck;
        for (int i = 1; i < 5; i++) {
            System.out.println("For Player" + i);
            for (int j = 1; j < 10; j++) {
                selectCard();
            }

        }
    }

    /**
     * This is the static method used for shuffel the cards for 4 players using random function
     */
    public static void selectCard() {
        Random randomCard = new Random();
        int suit = randomCard.nextInt(4);
        int rank = randomCard.nextInt(13);
        if (newDeck[suit][rank] == null) {
            selectCard();
        } else {
            System.out.println(newDeck[suit][rank]);
            newDeck[suit][rank] = null;
        }
    }

    /**
     *This is Main Method is Used For Calling the Static Methods
     */

    public static void main(String[] args) {
        System.out.println("Welcome In Deck Of Cards Program");
        distributeCards();

    }
}