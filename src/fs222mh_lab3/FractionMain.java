package fs222mh_lab3;

public class FractionMain {

	public static void main(String[] args) {
		
		Fraction test = new Fraction(10, 2);
		Fraction test2 = new Fraction(20, 3);
		
		System.out.println("bråktalet är: " + test.toString());
		if (test.isNegative()) {
			System.out.println("Oops, bråket är negativt");
		}
		
		test.subtract(test2);
		System.out.println("bråktalet är: " + test.toString());

		

	}

}
