package com.hillel.doroshenko.homeworks.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] cardSuits = {"\u2660", "\u2665", "\u2663", "\u2666"};
        String[] cardRanks = {"Ace", "King", "Queen", "Jack", "Ten", "Nine",
                "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
        String[] deck = new String[cardRanks.length * cardSuits.length];
        Scanner scan = new Scanner(System.in);
        int numberPlayers;
        int numberCards = cardRanks.length * cardSuits.length;

        numberPlayers = getNumberPlayers(scan);
        deck = createDeck(cardSuits, cardRanks, deck);
        deck = shuffling(deck, numberCards);
        deal(deck, numberPlayers);
    }

    public static int getNumberPlayers(Scanner scan) {
        System.out.println("Please, enter number of players from 2 to 10");
        while (true) {
            if (scan.hasNextInt()) {
                int result = scan.nextInt();
                if (result > 1 && result < 11) {
                    return result;
                } else {
                    System.out.println("Wrong data! Enter digit from 2 to 10!");
                }
            } else {
                System.out.println("Wrong data! Enter digit from 2 to 10!");
                scan.next();
            }
        }
    }

    public static String[] createDeck(String[] cardSuits, String[] cardRanks, String[] deck) {
        for (int i = 0; i < cardRanks.length; i++) {
            for (int j = 0; j < cardSuits.length; j++) {
                deck[cardSuits.length * i + j] = cardSuits[j] + " " + cardRanks[i];
            }
        }
        return deck;
    }

    public static String[] shuffling(String[] deck, int numberCards) {
        for (int i = 0; i < numberCards; i++) {
            int rand = i + (int) (Math.random() * (numberCards - i));
            String temp = deck[rand];
            deck[rand] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    public static void deal(String[] deck, int numberPlayers) {
        for (int i = 0; i < numberPlayers * 5; i++) {
            System.out.println(deck[i]);
            if (i % 5 == 4)
                System.out.println();
        }
    }
}