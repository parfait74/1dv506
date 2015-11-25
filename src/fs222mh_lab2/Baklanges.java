package fs222mh_lab2;

import java.util.Scanner;

public class Baklanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Skriv in ditt namn: ");
		String text = scan.nextLine();
		
		StringBuilder reversed = new StringBuilder();
		int i;
		for (i=text.length()-1; i >= 0; i--)
			reversed.append(text.charAt(i));
		
		System.out.println(reversed);
			
		scan.close();
	}

}
