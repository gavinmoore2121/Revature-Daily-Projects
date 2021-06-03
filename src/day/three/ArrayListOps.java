package day.three;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOps {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// Create demo list
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Hello");
		stringList.add(" world!");
		
		// Swap two elements, print as a demo.
		Collections.swap(stringList, 0, 1);
		for (String text: stringList) {
			System.out.print(text);
		}
		Collections.swap(stringList, 0, 1); // Swap back for convenience.
		System.out.println();
		
		// Make a copy, print.
		ArrayList<String> copyOfStringList = new ArrayList<String>();
		copyOfStringList = (ArrayList<String>) stringList.clone();
		
		for (String text: copyOfStringList) {
			System.out.print(text);
		}
		System.out.println();
		
		// Search an element
		System.out.println("The string 'Hello' is in index: " + stringList.indexOf("Hello"));
		System.out.println("The string 'Goodbye' is in index: " + stringList.indexOf("Goodbye"));
		
		// Combine two lists.
		copyOfStringList.addAll(stringList);
		for (String text: copyOfStringList) {
			System.out.print(text);
		}
	}

	
}
