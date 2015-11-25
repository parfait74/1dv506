package fs222mh_lab2;

import java.util.Random;
import java.util.Scanner;

public class FrekvensTabell {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int[] frequency = new int[6];
		int i = 0;
		int value = 0;
		int rolls = 0;
		
		System.out.print("How many times should we roll the dice?: ");
		rolls = scan.nextInt();
		for (i = 0; i < rolls; i += 1) {
			
			value = rand.nextInt(6)+1;;
			
			switch(value) {
			case 1: frequency[0] += 1;
			break;
			case 2: frequency[1] += 1;
			break;
			case 3: frequency[2] += 1;
			break;
			case 4: frequency[3] += 1;
			break;
			case 5: frequency[4] += 1;
			break;
			case 6: frequency[5] += 1;
			break;
			}
		}
		
		System.out.println("Frequency when rolling a dice " + rolls + " times" + "\n" +"Face" + "\t" + "Frequency");
		System.out.println("1: " + "\t" + frequency[0]);
		System.out.println("2: " + "\t" + frequency[1]);
		System.out.println("3: " + "\t" + frequency[2]);
		System.out.println("4: " + "\t" + frequency[3]);
		System.out.println("5: " + "\t" + frequency[4]);
		System.out.println("6: " + "\t" + frequency[5]);
		
		scan.close();

	}

}
