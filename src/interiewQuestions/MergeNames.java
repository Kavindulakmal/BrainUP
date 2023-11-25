package interiewQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 	Implement the uniqueNames method.
	When passed two arrays of names, it will return an array containing the names that appear in
	either or both arrays. The returned array should have no duplicates.

	For example, calling
	MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'})
	should return an array containing Ava, Emma, Olivia, and Sophia in any order.
 */

public class MergeNames {
	
	public static String [] uniqueNames(String []names01,String []names02) {
		Set<String> set = new HashSet<>(Arrays.asList(names01));
		set.addAll(Arrays.asList(names02));
		return set.toArray(new String[0]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names01 = new String [] {"Ava", "Emma", "Olivia"};
		String[] names02 = new String [] {"Olivia", "Sophia", "Emma"};
		System.out.println(String.join(", ",MergeNames.uniqueNames(names01, names02)));

	}

}
