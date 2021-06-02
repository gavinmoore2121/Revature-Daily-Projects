package day.one;

public class StringCounter {
	public static void main(String[] args) {
		countStringTraits("Sample Sentence number 123!!");
	}
	
	public static void countStringTraits(String input) {
		int vowelCount = 0;
		int consonantCount = 0;
		int spaceCount = 0;
		int digitCount = 0;
		
		for (char c : input.toCharArray()) {
			if (isVowel(c)) vowelCount++;
			else if (Character.isLetter(c)) consonantCount++;
		
			if (Character.isDigit(c)) digitCount++;
			if (Character.isWhitespace(c)) spaceCount++;
		}
		
		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + consonantCount);
		System.out.println("Space count: " + spaceCount);
		System.out.println("Digit count: " + digitCount);
	}
	
	public static boolean isVowel(char character) {
		switch(Character.toLowerCase(character)) 
		{
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u': return true;
		default: return false;
		}
	}
}
