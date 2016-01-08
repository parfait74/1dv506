package fs222mh_lab4.sorter_orter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SorteraOrter {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Start TestBlock
		/*Ort [] test = new Ort [3];
		test[0] = new Ort(19252, "Sollentuna");
		test[1] = new Ort(18222, "Nora");
		test[2] = new Ort(19352, "Solna");

		for (Ort ort : test)
			System.out.print(ort + " ");
		System.out.println("\n");
		
		Arrays.sort(test);
		for (Ort ort : test)
			System.out.print(ort + " ");
		System.out.println("\n");*/
		
		// Slut TestBlock
		
		File inputFile = new File ("/Volumes/Wintech/UDM/java/1DV506/src/fs222mh_lab4/orter.txt");
		System.out.println("Läser heltal från filen: " + inputFile);
		
		List<Ort> ortLista = new ArrayList<Ort>();
		Scanner scan = new Scanner (inputFile);		
		
		while (scan.hasNext()) {
			String currentLine = scan.nextLine();
			String splitChar = ";";
			String[] array = currentLine.split(splitChar);	// Create array after splitting at the ;
			//System.out.println(array[0]);
			//System.out.println(array[1]);
			int arrayPart1 = Integer.parseInt(array[0]);	//postnr
			String arrayPart2 = array[1];					//city
			Ort ort = new Ort(arrayPart1, arrayPart2);
			ortLista.add(ort);
		}
		int nbrOfCitys = ortLista.size();
		System.out.println("Antal funna orter: " + nbrOfCitys);
		
		Collections.sort(ortLista);							// Using collection instead of arrays since I use arrayList
		for (Ort ort : ortLista)
			System.out.println(ort.toString());
		


		scan.close();

	}

}
