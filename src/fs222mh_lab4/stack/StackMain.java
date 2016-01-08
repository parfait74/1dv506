package fs222mh_lab4.stack;

import java.util.Iterator;

public class StackMain {

	public static void main(String[] args) {
		
		PerfectStack test = new PerfectStack();
		
		if (test.isEmpty()) {
			System.out.println("Stacken är tom");
		}else {
				System.out.println("Stacken innehåller något");
		}
		
		test.push("volvo");
		test.push("saab");
		test.push("ferarri");
		test.push("skoda");
		test.push("renault");
		test.push("bmw");
		
		if (test.isEmpty()) {
			System.out.println("Stacken är tom");
		}else {
			System.out.println("Stacken innehåller något");
		}
		
		System.out.println(test.pop());
		System.out.println(test.peep());
		System.out.println(test.pop());
		System.out.println(test.peep());
		
		//Iterator test
		
		System.out.println( "\n" + "Test av Iterator nedan: ");
		
		Iterator<Object> it = test.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());;
		}
		
		
	}	
}
