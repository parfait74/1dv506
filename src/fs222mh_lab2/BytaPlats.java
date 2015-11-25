package fs222mh_lab2;

public class BytaPlats {

	public static void main(String[] args) {
		char[] text = {'t', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D'};
		System.out.println(text);
		int last = text.length-1;
		char temp = ' ';
		int i = 0;
		for (i = 0; i < text.length/2; i += 1) {
			temp = text[i];
			text[i] = text[last-i];
			text[last-i] = temp;
			System.out.println(i);
		}
		System.out.println(text);

	}

}
