Assignment 04: Card Deck Simulation 

 
📌 Description 
 
This project simulates a Card Deck using Java, implementing object-oriented principles. It includes functionalities to create a deck of cards, shuffle, and draw cards.

  
📂 File Structure 
1️⃣ Card.java 

Defines the Card class, representing a single playing card.
 
Methods & Functions: 

Card(String suit, String rank) – Constructor to initialize card suit and rank.
String getSuit() – Returns the suit of the card.
String getRank() – Returns the rank of the card.
String toString() – Returns a string representation of the card. 

2️⃣ Deck.java 
Manages a deck of 52 playing cards.

Methods & Functions:
Deck() – Constructor to initialize a standard deck of 52 cards.
void shuffle() – Shuffles the deck randomly.
Card drawCard() – Draws and returns the top card from the deck.
boolean isEmpty() – Checks if the deck is empty. 

3️⃣ Main.java 

The entry point of the program that demonstrates deck operations.

Methods & Functions:
public static void main(String[] args) – Creates a deck, shuffles, and draws cards to showcase functionality. 


🛠️ Technologies Used 

Java
Object-Oriented Programming (OOP)
