package fs222mh_lab2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OmvandOrdning {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> values = new ArrayList<Integer>();
		int value = 0;
		int sum = 0;
		
		while(value >= 0 ) {
			sum += 1;
			System.out.print("Mata in ett heltal, ett negativt tal avslutar: ");
			value = scan.nextInt();
			values.add(value);
}
		Collections.sort(values);
		Collections.reverse(values);
		sum = sum -1; 
		System.out.println("Antal positiva inmatningar: " + sum);
		System.out.println("Baklänges: " + values);
		scan.close();
	}

}
