package fs222mh_lab3;

public class Pnr {

	public static void main(String[] args) {
		String pnr = "401224-1234";
		
		System.out.print(getFirstPart(pnr) + "\n");
		
		System.out.print(getSecondPart(pnr) + "\n");
		
		System.out.print(isFemaleNumber(getSecondPart(pnr)) + "\n");
		
		System.out.print(isMaleNumber(getSecondPart(pnr)) + "\n");
		
		String pnr2 = "401224-1284";
		System.out.print(areEqual(pnr, pnr2));


	}
	
	private static String getFirstPart(String pnr) {
		String first = "";
		for (int i = 0; i < 6; i += 1) {
			first += pnr.charAt(i);			
		}
		return first;
		
	}
	
	private static String getSecondPart(String pnr) {
		String second = "";
		for (int i = 7; i < 11; i += 1) {
			second += pnr.charAt(i);			
		}
		return second;
	}
	
	private static boolean isFemaleNumber(String pnr) {
		//Even number is female
		char check = pnr.charAt(3);
		int nbr = Character.getNumericValue(check);
		if ( nbr % 2 != 0) {
			return true;
		}
		return false;
		
	}
	
	private static boolean isMaleNumber(String pnr) {
		//Odd number is male
		char check = pnr.charAt(3);
		int nbr = Character.getNumericValue(check);
		if ( nbr % 2 == 0) {
			return true;
		}
		return false;
	}
	
	private static boolean areEqual(String pnr1, String pnr2) {
		boolean check = true;
		for (int i = 0; i < 11; i += 1) {
			if (pnr1.charAt(i) != pnr2.charAt(i)) {
				check = false;
				break;
			}
		}
		if (check) {
			return true;
		} else {
			return false;
		}
	} 

}
