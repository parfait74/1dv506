package fs222mh_lab2;

import java.util.Scanner;

public class NastStorsta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int value = 0;
		int max = 0;
		int second = 0;
		
		while (sum != 10) {
			sum ++;
			System.out.print("Skriv ett heltal: ");
			value = scan.nextInt();
			if (value > max){
				second = max;
				max = value;
				}
			else if ( value > second) {
				second = value;
			}
				
		}
		System.out.println("Näst största värdet är: " + second);
		scan.close();

	}

}


