public class Card {
    private String suit;
    //suit: represents the suit of the card (e.g. "Hearts", "Diamonds", "Clubs", "Spades")
    private String rank;
    //rank: represents the rank of the card (e.g. "2", "3", "4", ..., "King", "Ace")

    //Constructor takes the suit and rank of a card.
    // Creates a new Card object with those values.
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //getSuit(): getter method that returns the suit of the card.
    public String getSuit() {
        return suit;
    }

    //getRank(): getter method that returns the rank of the card.
    public String getRank() {
        return rank;
    }

    //toString(): overridden method that returns a string representation of the card in the format "{rank} of {suit}".
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    //sameCard(Card other): method that takes another Card object and returns true if both cards have the same suit.
    public boolean sameCard(Card other) {
        return suit.equals(other.suit);
    }

    //compareCard(Card other): method that takes another Card object and returns true if both cards have the same rank.
    public boolean compareCard(Card other) {
        return rank.equals(other.rank);
    }
}
