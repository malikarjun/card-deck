package com.paypal.bootcamp;
import java.util.*;


class SortByValue implements Comparator<Card>{
    private int computeValue(Card c) {
        return c.getSuite().ordinal()*100 + c.getValue();
    }

    public int compare(Card c1, Card c2) {
        return computeValue(c1) - computeValue(c2);
    }

}
public class Deck {
    final int NUM_OF_CARDS_STD = 52;
    ArrayList<Card> cards;

    public Deck(int noOfCards) {
        cards = new ArrayList<Card>();
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        for (Suite suite : Suite.values()) {
            if(suite == Suite.JOKER)
                continue;
            for (int value : values) {
                cards.add(new Card(suite, value));
            }

        }

        for(int i = 0; i < (noOfCards - NUM_OF_CARDS_STD); i++)
            cards.add(new Card(Suite.JOKER, -1));
    }

    public void sort() {
        Collections.sort(cards, new SortByValue());
    }

    public Deck(ArrayList<Card> cards) {
        cards = new ArrayList<Card>();
        cards.addAll(cards);
    }


    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getDeck() {
        return cards;
    }

    public void setDeck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {

        Collections.shuffle(cards);
    }

    public Card deal() {
        Card dealCard = null;
        if (cards.size() != 0) {
            dealCard = cards.get(0);
            cards.remove(0);
        }
        return dealCard;
    }

    @Override
    public String toString() {
        return cards.toString();
    }

    public static void main(String[] args)
    {
        Deck d = new Deck(53);
        d.shuffle();
        System.out.println(d.toString());

        d.sort();
        System.out.println(d.toString());


    }




}

