package fs222mh_lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RaknaTecken {

	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File ("/Volumes/Wintech/UDM/java/1DV506/src/fs222mh_lab4/ChampagnenBlirDyrare.txt");
		
		//Declare variables
		int bigLetters = 0;
		int smallLetters = 0;
		int whiteSpace = 0;
		int otherChars = 0;
		
		Scanner scan = new Scanner (inputFile);
		
		while (scan.hasNext()) {
			String textLine = scan.nextLine();
			System.out.println(textLine);

			//Iterate and check what kind of char 'i' is.
			for (int i = 0; i < textLine.length(); i += 1) {
				if ( Character.isUpperCase(textLine.charAt(i))) {
					bigLetters += 1;
				} else if ( Character.isLowerCase(textLine.charAt(i))) {
					smallLetters += 1;
				} else if ( Character.isWhitespace(textLine.charAt(i))) {
					whiteSpace += 1;
				} else {
					otherChars += 1;
				}
			}
		}
		scan.close();
		
		System.out.println("Antal stora bokstäver: " + bigLetters);
		System.out.println("Antal små bokstäver: " + smallLetters);
		System.out.println("Antal blanksteg: " + whiteSpace);
		System.out.println("Antal övriga: " + otherChars);
		
		// Jag får fel antal blanksteg, de andra stämmer. Räknar jag blanksteg i programmet Textredigare i Macen får jag samma antal som i programmet.

	}

}
