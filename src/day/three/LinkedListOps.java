package day.three;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOps {
	
	public static void main(String[] args) {
		// Create demo list
		LinkedList<String> list = new LinkedList<String>();
		list.add("This ");
		list.add("is ");
		list.add("a ");
		list.add("linked ");
		list.add("list ");
		
		// Iterate through backwards
		for(Iterator<String> i = list.descendingIterator(); i.hasNext();) {
			System.out.print(i.next());
		}
		System.out.println();
		
		// Add element to the end. Iterate through to demo.
		list.offerLast("!");
		for (String t: list) {
			System.out.print(t);
		}
	}

}
