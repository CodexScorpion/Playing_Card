/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new deck of cards
        Deck deck = new Deck();
        //Scanner Class to take User Input
        Scanner sc = new Scanner(System.in);
        int choice;
        // Loop to keep the program running until the user chooses to exit
        do {
            // Menu options
            System.out.println("\n-------------------");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print a Card");
            System.out.println("4. Same Cards");
            System.out.println("5. Compare Cards");
            System.out.println("6. Find a Card");
            System.out.println("7. Deal a Card");
            System.out.println("8. Shuffle Deck");
            System.out.println("9. Exit");
            System.out.println("-------------------");
            System.out.print("Enter your choice: ");

            // Get user input for menu option
            choice = sc.nextInt();

            // Switch statement for each menu option
            switch (choice) {
                case 1:
                    deck.createDeck();
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    deck.printCard();
                    break;
                case 4:
                    deck.sameCard();
                    break;
                case 5:
                    deck.compareCard();
                    break;
                case 6:
                    deck.findCard();
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    deck.shuffleDeck();
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
                    break;
            }
        } while (choice != 9);

        sc.close();
    }
}
