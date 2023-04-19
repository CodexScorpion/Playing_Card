# Playing_Card
Program is a menu-driven Java program that simulates a deck of cards.program uses ArrayList to create an array of card objects and provides several methods to perform various operations on the deck of cards.

## Overview:
This is a menu-driven Java program for a standard deck of 52 cards. The program allows the user to perform various operations on the deck of cards, such as printing the deck, finding a specific card, dealing 5 random cards, shuffling the deck, and more. The program uses ArrayList to create an array of Card objects to represent the deck.

## Files:
The program consists of the following files:

_Card.java:_ Defines the Card class, which represents a single card in the deck.

_Deck.java:_ Defines the Deck class, which represents the deck of 52 cards and contains various methods to perform operations on the deck.

_Main.java:_ Contains the main method, which runs the program and prompts the user for input.



## Methods:
The Deck class contains the following methods:


createDeck(): Initializes the deck with 52 Card objects, representing each card in the deck.

printDeck(): Prints all 52 cards in the deck.

printCard(): Prints a single card.

sameCard(): Returns an ArrayList of Card objects that belong to the same suit as a specified card.

compareCard(): Returns an ArrayList of Card objects that have the same rank as a specified card.

findCard(): Returns a Card object that matches a specified suit and rank.

dealCard(): Returns an ArrayList of 5 randomly selected cards from the deck.

shuffleDeck(): Randomizes the order of the cards in the deck.


## Usage:
To run the program, compile all three files and run the Main class. The program will display a menu of options for the user to select from. The user can choose an option by entering a number corresponding to the desired operation. The program will then prompt the user for any additional information needed to perform the operation, such as the suit and rank of a card to find. The program will then display the results of the operation.
