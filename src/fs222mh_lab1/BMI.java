package fs222mh_lab1;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange din längd i meter: ");
		double height = scan.nextDouble();
		System.out.print("Ange din vikt i kilogram: ");
		int weight = scan.nextInt();
		
		int BMI = (int) (weight/(height*height));
		System.out.println("Ditt BMI är: " + BMI);

	}

}
