package fs222mh_lab2;

import java.util.Scanner;

public class RaknaA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange en textsträng: ");
		String text = scan.nextLine();
		int A = 0;
		int a = 0;
		int i;
		for (i=0; i<text.length(); i ++)
		{
			if (text.charAt(i) == 'A')
				A = A + 1;
			else if (text.charAt(i) == 'a')
				a = a + 1;
		}			
		System.out.println("Antal A: "+ A + "\n" + "Antal a: "+a);
		scan.close();

	}

}
