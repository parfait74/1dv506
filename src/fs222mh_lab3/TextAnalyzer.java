package fs222mh_lab3;

public class TextAnalyzer {
	private String textToAnalyze;
	
	public TextAnalyzer(String text) {
		textToAnalyze = text;		
	}
	
	public int charCount() {
		int count = 0;
		int i = 0;
		while (i < textToAnalyze.length()) {
			count += 1;
			i += 1;
		}
		return count;
	}
	
	public int upperCaseCount() {
		int count = 0;
		int i = 0;
		for ( i = 0; i < textToAnalyze.length(); i += 1) {
			if (Character.isUpperCase(textToAnalyze.charAt(i))) {
				count += 1;
			}
		}
		return count;
	} 
	
	public int whiteSpaceCount() {
		int count = 0;
		int i = 0;
		for ( i = 0; i < textToAnalyze.length(); i += 1) {
			if (Character.isWhitespace(textToAnalyze.charAt(i))) {
				count += 1;
			}
		}
		return count;
	}
	
	public int digitCount() {
		int count = 0;
		int i = 0;
		for ( i = 0; i < textToAnalyze.length(); i += 1) {
			if (Character.isDigit(textToAnalyze.charAt(i))) {
				count += 1;
			}
		}
		return count;
	} 
	
	public boolean containsChar(char character) {
		int i = 0;
		for ( i = 0; i < textToAnalyze.length(); i += 1) {
			if (textToAnalyze.charAt(i) == character) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsString(String subString) {
		if (textToAnalyze.contains(subString)) {
			return true;
		}
		return false;
	}
}
