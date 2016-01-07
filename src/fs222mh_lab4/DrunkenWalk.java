package fs222mh_lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Ange storlek: ");
		int size = scan.nextInt();
		System.out.println("Ange max antal steg: ");
		int maxSteps = scan.nextInt();
		System.out.println("Ange antal slumpvandringar: ");
		int drunkenWalks = scan.nextInt();
		double failure = 0;
		
		for (int i = 0; i < drunkenWalks; i += 1) {
			RandomWalk rw = new RandomWalk(maxSteps, size);
			rw.walk();
			System.out.println(rw.toString());
			if (!rw.isBounds() ) {
				failure += 1;
			}
		}
		
		double percentFailure = (failure/(int)drunkenWalks);
		DecimalFormat df = new DecimalFormat("#.##");
		int drunksInWater = (int)failure;					
		System.out.println("Av " + drunkenWalks + " onyktra personer, föll " + drunksInWater + ", (" + (df.format(percentFailure * 100)) + "%) i vattnet");
		
		
		
		scan.close();

	}

}
