package fs222mh_lab3;

public class MultiDisplay {
	private String displayMessage;
	private int displayCount;



public void setDisplayMessage (String message) {
	displayMessage = message; 
}

public void setDisplayCount (int count) {
	displayCount = count;
}

public void display() {
	int i = 0;
	while ( i < displayCount) {
		System.out.println(displayMessage);
		i += 1;
	}
}

public void display(String message, int count) {
	displayMessage = message;
	displayCount = count;
	int i = 0;
	while ( i < displayCount) {
		System.out.println(displayMessage);
		i += 1;
	}
}

public String getDisplayMessage() {
	return displayMessage;
}

}






