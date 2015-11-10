package fs222mh_lab1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Avstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("Ange koordidat X1: ");
		double x1 = scan.nextDouble();
		System.out.print("Ange koordinat Y1: ");
		double y1 = scan.nextDouble();
		System.out.print("Ange koordidat X2: ");
		double x2 = scan.nextDouble();
		System.out.print("Ange koordinat Y2: ");
		double y2 = scan.nextDouble();
		
		double avstand = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
		
		DecimalFormat dFormat = new DecimalFormat("0.###");
		String svar = dFormat.format(avstand);
		
		System.out.println("Avståndet mellan punkerna är: "+svar);
		
		scan.close();

	}

}
