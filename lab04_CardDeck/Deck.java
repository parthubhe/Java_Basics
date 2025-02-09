import java.util.*;

class Deck{
	ArrayList<Card> deck;
	public Deck(){
		deck = new ArrayList<>();}
		 
		public void createDeck(){
			String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
			
			String[] suits = {"Hearts","Club","Spades","Diamonds"};
			for(String rank: ranks){
				for(String suit: suits){
					deck.add(new Card(rank,suit));
				}
			}
		}
		public void displayDeck(){
			for(Card card: deck){
				System.out.println("The Cards rank is: " + card.rank +"\tThe Cards suit is: "+ card.suit);
			}
		}
		public void shuffleDeck(){
			 Collections.shuffle(deck);
		}
		public void TwoRandomCards(){
        Random rand = new Random();
        int index1 = rand.nextInt(deck.size());
        int index2 = rand.nextInt(deck.size());
        while (index1 == index2) {
            index2 = rand.nextInt(deck.size());
        }
        Card card1 = deck.get(index1);
        Card card2 = deck.get(index2);
        System.out.println("The first random card is: " + card1.rank + " of " + card1.suit);
        System.out.println("The second random card is: " + card2.rank + " of " + card2.suit);
		}
		public void cardPlayers() {
        shuffleDeck(); 
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            player1.add(deck.get(i * 3)); 
            player2.add(deck.get(i * 3 + 1)); 
            player3.add(deck.get(i * 3 + 2)); 
        }
        System.out.println("Player 1's cards:");
        for (Card card : player1) {
            System.out.println(card.rank + " of " + card.suit);
        }
        System.out.println("Player 2's cards:");
        for (Card card : player2) {
            System.out.println(card.rank + " of " + card.suit);
        }
        System.out.println("Player 3's cards:");
        for (Card card : player3) {
            System.out.println(card.rank + " of " + card.suit);
        }
    }
	 public void sameCard(){
		 Random rand = new Random();
        int index1 = rand.nextInt(deck.size());
        int index2 = rand.nextInt(deck.size());
        while (index1 == index2) {
            index2 = rand.nextInt(deck.size());
        }
        Card card1 = deck.get(index1);
        Card card2 = deck.get(index2);
		 if(card1.suit == card2.suit){
			System.out.println("Cards are of same suit");
		 }
		 else{
			System.out.println("Cards are not of same suit");
		 }
	 }
	 public void compareCard(){
		 Random rand = new Random();
        int index1 = rand.nextInt(deck.size());
        int index2 = rand.nextInt(deck.size());
        while (index1 == index2) {
            index2 = rand.nextInt(deck.size());
        }
        Card card1 = deck.get(index1);
        Card card2 = deck.get(index2);
		 if(card1.rank == card2.rank){
			System.out.println("Cards are of equal rank");
		 }
		 else{
			System.out.println("Cards are not of equal rank");
		 }
	 }
	 public void printCard(){
		Random rand = new Random();
        int index1 = rand.nextInt(deck.size());
        Card card1 = deck.get(index1);
        System.out.println("The first random card is: " + card1.rank + " of " + card1.suit);
	 }
 }
			  

		
	
