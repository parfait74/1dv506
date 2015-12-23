package fs222mh_lab3;

public class DeckMain {

	public static void main(String[] args) {
		
		Deck kortLek = new Deck();				// ny kortlek
		Card kort;								// behövde ett kort för att presentera korten i leken
		
		System.out.println("Antal kort i leken: " + kortLek.getCards());	//antal kort i leken
		
		kortLek.shuffle();
		
		int i = 8;								// dela ut 9 kort på måfå
		while (kortLek.getCards() > (51-i)) {
			kort = kortLek.random();
			System.out.println("Utdelat kort: " + kort.toString());
			System.out.println("Antal kort kvar: " + kortLek.getCards());
		}
		
		kortLek.shuffle();


	}

}
