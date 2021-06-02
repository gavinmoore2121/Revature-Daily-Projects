package day.two;

import java.util.Arrays;
import java.util.Collections;

public class CountAllLetters {

	public static void main(String[] args) {
		String demoSentence = "This is a demonstration sentence.";
		
		Integer[] letterCount = new Integer[26];
		
		int demoLength = demoSentence.length();
		
		String demoSentenceLowercase = demoSentence.toUpperCase();
		int index = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			letterCount[index] = demoLength - demoSentenceLowercase.replaceAll(String.valueOf(c), "").length();
			System.out.println(c + " " +letterCount[index]);
			index++;
		}
		
		int max = Collections.max(Arrays.asList(letterCount));
		int maxLetterIndex = Collections.binarySearch(Arrays.asList(letterCount), max);
		System.out.println("Max value: Letter " + (Character.toString('A' + maxLetterIndex)) + " with " + max + " occurences.");
		
		int min = Collections.min(Arrays.asList(letterCount));
		int minLetterIndex = Collections.binarySearch(Arrays.asList(letterCount), min);
		System.out.println("Max value: Letter " + (Character.toString('A' + minLetterIndex)) + " with " + min + " occurences.");
	}

}
