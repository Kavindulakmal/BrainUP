package interiewQuestions;
/*
 * When user type a word, if there have vowels print true .else print false
 */

public class StringContainsVowels {
	
	public static boolean stringContainsvowels(String input) {
		
		return input.toLowerCase().matches(".*[aeiou].*");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringContainsvowels("apple")); //true
		System.out.println(stringContainsvowels("Tv")); //flase
		System.out.println(stringContainsvowels("civic"));// true
	}

}
