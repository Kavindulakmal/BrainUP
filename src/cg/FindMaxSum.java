package cg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Implement the findMaxSum method that, efficiently with respect to time used, returns the 
 * largest sum of any two elements in the given list of positive numbers.
For example, the largest sum of the list { 5, 9, 7, 11} is the sum of the elements 
9 and 11, which is 20. java program
 */



public class FindMaxSum {
	
	public static int findMaxSum(List<Integer> nums) {
        if (nums.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two numbers");
        }

        Collections.sort(nums); // Sort the list in ascending order

        // The largest sum will be the sum of the last two elements after sorting
        return nums.get(nums.size() - 1) + nums.get(nums.size() - 2);
    } 
	
    public static void main(String[] args) {
       // List<Integer> numbers = new ArrayList<>(List.of(5, 9, 7, 11));
       // int maxSum = findMaxSum(numbers);
       // System.out.println("The largest sum of any two elements is: " + maxSum);
    }
}

