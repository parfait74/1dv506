package fs222mh_lab2;

import java.util.Scanner;
import java.util.Random;

public class HighLow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nbrOfGuesses = 0;
		int guess = 0;
		Random rand = new Random();
		int randomNumber = rand.nextInt(100)+1;
		
		while (nbrOfGuesses < 10 && guess != randomNumber){
			nbrOfGuesses += 1;
			System.out.print("Gissa på ett tal mellan 1 och 100: ");
			guess = scan.nextInt();
			if (guess < randomNumber)
				System.out.println("Din gissning på " + guess + " var för lågt");
			else if (guess > randomNumber)
				System.out.println("Din gissning på " + guess + " var för högt");
			else
				System.out.println("Perfa, Spot on! " + guess + " var helt rätt! och bara " + nbrOfGuesses + " gissningar!");
		}
		
		if ( nbrOfGuesses == 10 && guess != randomNumber)
			System.out.println("Tyvärr, du har gissat 10 gånger nu!");
			
		scan.close();


	}

}
