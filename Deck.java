package javalab;

import java.util.*;
public class Deck {
    ArrayList<Card> cards = new ArrayList<Card>();
    

    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public Deck() {
        for (String s : suit) {
            for (String v : values) {
                this.cards.add(new Card(s, v));
                System.out.println(s + " : " + v);
            }
        }
        
    }

    public ArrayList<Card> getdeck() {
        return cards;
    }

    public Card getCard() {
        return cards.get(0);
    }
    public void shuffle() {
    	Collections.shuffle(this.cards);
    }
    
    public ArrayList<Card> samecard() {
        ArrayList<Card> samecards = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            Card card1 = cards.get(i);
            for (int j = i + 1; j < cards.size(); j++) {
                Card card2 = cards.get(j);
                if (card1.getRank().equals(card2.getRank())) {
                    samecards.add(card1);
                    samecards.add(card2);
                }
            }
        }
        return samecards;
    		
    	}
    public boolean findCard(String suit, String rank) {
        for (Card card : cards) {
            if (card.getsuit().equals(suit) && card.getRank().equals(rank)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> dealCard(int numCards) {
        ArrayList<Card> dealtCards = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < numCards; i++) {
            int randomIndex = rand.nextInt(cards.size());
            dealtCards.add(cards.remove(randomIndex));
        }
        return dealtCards;
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    	
}
