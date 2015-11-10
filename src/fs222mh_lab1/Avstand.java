package fs222mh_lab1;

import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Ange koordidat X1: ");
		int x1 = scan.nextInt();
		System.out.print("Ange koordinat Y1: ");
		int y1 = scan.nextInt();
		System.out.print("Ange koordidat X2: ");
		int x2 = scan.nextInt();
		System.out.print("Ange koordinat Y2: ");
		int y2 = scan.nextInt();
		
		double avstand = Math.sqrt((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
		
		System.out.println("Avståndet mellan punkerna är: "+avstand);
		
		scan.close();

	}

}
