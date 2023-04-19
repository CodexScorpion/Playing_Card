import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;
    private Card card;
    private String suit;
    private String rank;

    // Constructor initializes the deck with createDeck() method
    public Deck() {
        createDeck();
    }

    // Creates a new deck of 52 cards
    public void createDeck() {
        cards = new ArrayList<Card>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Prints all the cards in the deck
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.toString());
        }
    }

    // Prints a specific card
    public void printCard() {
        System.out.println(card.toString());
    }

    // Returns an ArrayList of all cards with the same suit as the given card
    public ArrayList<Card> sameCard() {
        ArrayList<Card> sameSuitCards = new ArrayList<Card>();
        for (Card c : cards)
            if (c.sameCard(card)) {
                sameSuitCards.add(c);
            }
        return sameSuitCards;
    }

    // Returns an ArrayList of all cards with the same rank as the given card
    public ArrayList<Card> compareCard() {
        ArrayList<Card> sameRankCards = new ArrayList<Card>();
        for (Card c : cards)
            if (c.compareCard(card)) {
                sameRankCards.add(c);
            }
        return sameRankCards;
    }

    // Finds a specific card based on its suit and rank
    public Card findCard() {
        for (Card card : cards) {
            if (!card.getSuit().equals(suit) || !card.getRank().equals(rank)) continue;
            return card;
        }
        return null;
    }

    // Deals five cards from the deck and returns them in an ArrayList
    public ArrayList<Card> dealCard() {
        ArrayList<Card> dealtCards = new ArrayList<Card>();
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            dealtCards.add(cards.get(i));
        }
        return dealtCards;
    }

    // Shuffles the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
