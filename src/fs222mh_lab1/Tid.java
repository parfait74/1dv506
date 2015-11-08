package fs222mh_lab1;

import java.util.Scanner;

public class Tid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange antal sekunder: ");
		int totalSeconds = scan.nextInt();
		int seconds = totalSeconds % 60;
		int totalMinutes = totalSeconds / 60;
		int minutes = totalMinutes % 60;
		int hours = totalMinutes / 60;
		
		System.out.println("Detta motsvarar: " + hours + " timmar, " +minutes + " minuter, " + seconds + " sekunder");


	}

}
