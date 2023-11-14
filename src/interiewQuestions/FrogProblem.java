package interiewQuestions;

/*
A frog only moves forward, but it can move in steps 1 inch long or in jumps 2 inches long.
A frog can cover the same distance using different combinations of steps and jumps.

Write a function that calculates the number of different combinations
a frog can use to cover a given distance.

For example, a distance of 3 inches can be covered in three ways: step-step-step, step-jump, and jump-step.
 */

public class FrogProblem {
	
	public static int numberOfways(int input) {
		
		if(input == 1) return 1;
		if(input == 2) return 2;
		
		return numberOfways(input-1) + numberOfways(input-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfways(10));
		//Fibonacci sequence

	}

}
