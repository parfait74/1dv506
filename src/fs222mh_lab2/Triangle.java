package fs222mh_lab2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Skriv ett positivt udda heltal: ");
		int number = scan.nextInt();
		
		if (number % 2 != 0){
			System.out.println("Rätvinklig triangel:");
			for (int i = 0; i <= number; i += 1)
			{
				for (int j = 0; j < number-i; j += 1)
				{
					System.out.print(" ");
				}
				for (int k = 0; k < i; k += 1)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			System.out.println("\n" + "Likbent triangel:");
			for (int i = 1; i <= number; i += 2)
			{
				for (int j = 0; j < (number-i)/2; j += 1)
				{
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k += 1)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}
			
		else 
			System.out.println("Obs! Du behöver skriva ett UDDA positivt heltal");
		
		scan.close();

	}

}
