package fs222mh_lab4.stack;

import java.util.Iterator;

public interface Stack {
	int size();
	boolean isEmpty();
	void push(Object element);
	Object pop();
	Object peep();
	
	Iterator<Object> iterator();

}
