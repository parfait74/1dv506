package fs222mh_lab3;

public class Fraction {
	private int te;
	private int en;
		
	public Fraction(int uppe, int nere) {
		te = uppe;
		setEn(nere);
	}
	
	private void setEn(int check) {
		if (check != 0) {
			en = check;
		} else {
			System.err.println("Nämnare måste vara över 0");
		}
	}
	
	public String toString() {
		return (te + " / " + en);
	}
	
	public int getNumerator() {
		return te;
	}
	
	public int getDominator() {
		return en;
	}
	
	public boolean isNegative() {
		int sum = te/en;
		if ( sum < 0) {
			return true;
		}
		return false;
	}
	
	public boolean isEqualTo(Fraction compare) {
		if (this.te == compare.te) {
			if (this.en == compare.en) {
				return true;
			}
		}
		return false;
	}
	
	public void add(Fraction addNbr) {
		int tal1Nom = this.te * addNbr.en;
		int tal1Den = this.en * addNbr.en;
		int tal2Nom = this.en * addNbr.te;
		this.te = tal1Nom + tal2Nom;
		this.en = tal1Den;
	}
	
	public void subtract(Fraction addNbr) {
		int tal1Nom = this.te * addNbr.en;
		int tal1Den = this.en * addNbr.en;
		int tal2Nom = this.en * addNbr.te;
		this.te = tal1Nom - tal2Nom;
		this.en = tal1Den;
	}
	
	public void multiply(Fraction addNbr) {
			this.te = this.te * addNbr.te;
			this.en = this.en * addNbr.en;
		}
		
	public void divide(Fraction addNbr) {
		this.te = this.te * addNbr.en;
		this.en = this.en * addNbr.te;
		
	}

}
