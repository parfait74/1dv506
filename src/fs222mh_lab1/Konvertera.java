package fs222mh_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Konvertera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange grader i Fahrenheit: ");
		
		double fahrenheit = scan.nextDouble();
		double celcius = (fahrenheit-32)*5/9;
		
		DecimalFormat dFormat = new DecimalFormat("0.#");
		String utfall = dFormat.format(celcius);
		
		System.out.println("Detta blir i Celsius: " + utfall);
		scan.close();


	}

}
