package fs222mh_lab1;

import java.util.Scanner;

public class SummaAvTre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ange ett tresiffrigt tal: ");
		int tal = scan.nextInt();
		int number1 = tal / 100;
		tal = tal % 100;
		int number2 = tal / 10;
		int number3 = tal % 10;
		
		int total = number1+number2+number3;
	
		System.out.println("Summan av de tre enskilda talen blir: " + number1 +" " +number2 +" " +number3 + " = " +total );


	}

}
