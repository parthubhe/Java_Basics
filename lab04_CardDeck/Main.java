import java.util.*;

class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("Creating the deck\n");
		deck.createDeck();
		System.out.println("Created the deck\n");
		System.out.println("Displaying deck\n");
		deck.displayDeck();
		System.out.println("Shuffling the deck\n");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("2 random Cards\n");
		deck.TwoRandomCards();
		System.out.println("Distributing 5 random cards to 3 Players \n");
		deck.cardPlayers();
		System.out.println("Printing a random card\n");
		deck.printCard();
		System.out.println("Checking if 2 random Cards are of same suit\n");
		deck.sameCard();
		System.out.println("Checking if 2 random Cards are of same rank\n");
		deck.compareCard();
	}
}