package com.bilqu.solve.prob;

import java.lang.Math;
import java.util.Arrays;

public class DeckOfCards {
    private Cards[] deck;
    private int cardHold;

    public DeckOfCards() {
        deck = new Cards[52];
        int n = 0;
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                deck[n] = new Cards(i, j);
                n = n + 1;
            }
        }
        cardHold = -1;

        Arrays.stream(deck).forEach(i -> System.out.format("%s,",i));
        System.out.println();

    }

    public void Shuffle() {
        // shuffles ands resets deck
        int i = 0;
        while (i < 52) {
            int rando = (int) (5.0 * (Math.random()));
            Cards temp = deck[rando];
            deck[rando] = deck[i];
            deck[i] = temp;
            i++;
        }

        Arrays.stream(deck).forEach(c -> System.out.format("%s,",c));
    }

    public Cards deal() {
        // if there are any more cards left in the deck, return the next one and
        // increment
        // index; return null if all the cards have been dealt
        // ***Question, increment before or
        // after??***----------------------------------------
        if (!hasMoreCards()) {
            return null;
        } else {
            Cards temp = null;
            temp = deck[cardHold];
            cardHold = cardHold + 1;
            return temp;
        }
    }

    public boolean hasMoreCards() {
        // returns true if there are more cards left, else return false
        if (cardHold == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        DeckOfCards deck2 = new DeckOfCards();
        deck2.Shuffle();


        for (int i = 0; i < 52; i++)
            System.out.println(deck2.deal());
    }


    public static class Cards {
        int i;
        int j;

        Cards(int i, int j){
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "Cards{" +
                    "i=" + i +
                    ", j=" + j +
                    '}';
        }
    }
}
