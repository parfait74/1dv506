package fs222mh_lab1;

import java.util.Random;

public class TelefonNummer {

	public static void main(String[] args) {
		Random rand = new Random();
		int r1 = rand.nextInt(10);
		int r2 = rand.nextInt(10);
		int r3 = rand.nextInt(10);
		int l1 = rand.nextInt(9)+1;
		int l2 = rand.nextInt(10);
		int l3 = rand.nextInt(10);
		int l4 = rand.nextInt(10);
		int l5 = rand.nextInt(10);

		System.out.println("0"+r1+r2+r3+"-"+l1+l2+l3+l4+l5);

	}

}
