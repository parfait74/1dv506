package fs222mh_lab1;

import java.util.Scanner;

public class KortNamn {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange ditt förnamn: ");
		String name = scan.nextLine();
		System.out.print("Ange ditt efternamn: ");
		String surName = scan.nextLine();
		
		char name1 = name.charAt(0);
		String surName4 = surName.substring(0, 4);
		
		
		System.out.println("Kort namn:" + name1 + ". " + surName4);
		
		scan.close();
	}

}
