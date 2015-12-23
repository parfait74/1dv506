package fs222mh_lab3;

public class Card {
	
	private int rank;
	private int suit;
	
	private static String[] suits = {"hearts", "spades", "diamonds", "clubs"};
	private static String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {								// Skriver ut vilket kort som en sträng beroende på position i array
		return (ranks[rank] + " of " + suits[suit]);
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getSuit() {
		return suit;
	}

}
