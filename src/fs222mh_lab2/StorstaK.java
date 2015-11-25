package fs222mh_lab2;

import java.util.Scanner;

public class StorstaK {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ange ett positivt heltal: ");
		int helTal = scan.nextInt();
		int sum = 0;
		int K = 0;
				
		while ((sum + K) < helTal) {
			sum = sum + K;
			System.out.println("K="+K);
			System.out.println("sum =" +sum);
			K = K + 2;
		}
	
		System.out.println(" Största tal K sådant att 0+2+4+6+....+K < " + helTal +" => " + (K-2));
		

		scan.close();
	}

}
