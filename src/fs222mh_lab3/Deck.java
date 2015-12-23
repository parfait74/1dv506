package fs222mh_lab3;

import java.util.Random;

public class Deck {
	private Card[] cards;
	int i;											//antal kort, räknas ner när man drar ett  kort
	
	public Deck() {
		i = 51;
		cards = new Card[52];						// ny kortlek (array) med längd 52
		int j = 0;
		for (int k = 0; k <= 3; k += 1) {			// Gå igenom varje färg
			for (int l = 0; l <= 12; l += 1) {		// En valör per färg
				cards[j] = new Card(k, l);			// Skapa ett kortobjekt
				j += 1;
			}
		}
	}
	
	public void shuffle() {
		if ( i == 51) {
			int j;
			for (j = i; j > 0; j -= 1) {
				int random = (int)(Math.random() * ( i + 1 ));
				Card temp = cards[i];
				cards[i] = cards[random];
				cards[random] = temp;
			}
		} else {
			System.err.println("Måste vara full kortlek för att blanda");

		}
		
		
	}
	
	public Card random() {							// Dra ett kort och räkna ner i
		Random generator = new Random();
		int index = 0;
		index = generator.nextInt(i);
		Card temp = cards[index];					// dra ett slupmässigt kort
		cards[index] = cards[i];					
		cards[i] = null;							// sätt sista i till null för att säkerställa man bara får fräscha kort
		i -= 1;										// räkna ner antalet kort kvar i leken
		return temp;
	}
	
	public int getCards() {
		return i+1;									// + 1 eftersom den går från 0 - 51
	}
	
	

	

}
