package fs222mh_lab4.sorter_orter;

public class Ort implements Comparable<Ort> {
	
	// Fields
	private int postNr = 0;
	private String ort = "";
	
	// Constructor for Ort
	public Ort(int nbr, String name) {
		postNr = nbr;
		ort = name;
	}
	
	public int getPostNr() {
		return postNr;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public String toString() {
		return ort + " " + postNr;
	}
	
	// Implement Comparable
	public int compareTo(Ort o) {
		return postNr - o.postNr;
	}

}
