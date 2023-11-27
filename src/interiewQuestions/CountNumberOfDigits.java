package interiewQuestions;

import java.util.Scanner;

/*
 * 	For Positive Number
 * 
		Input: 1234
			Output: The number of digits in 1234 is: 4
	For 0
		Input: 0
			Output: The number of digits in 0 is: 1
	For Negative Number
		Input: -12345
			Output: The number of digits in -12345 is: 5
 */

public class CountNumberOfDigits {
	
	public static int countDigit(int n) {
		if(n==0) return 1;
		
		if(n < 0) n= -n;
		
		int r=0;
		while(n!=0) {
			n = n/10;
			r++;
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter No :" );
		int n = sc.nextInt();
		System.out.println("No of Digit" +n+ "are :" +countDigit(n));
		

	}

}
