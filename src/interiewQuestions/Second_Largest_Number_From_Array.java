package interiewQuestions;

//Todo
//check array element- size>=2
//check element duplicate 
//check elements same

import java.util.Arrays;

public class Second_Largest_Number_From_Array {
	
	
	public static void print2ndLargest(int arr[]) {
		
		int size = arr.length;
		if(size<2) {
			System.out.println("Invalid input pls enter 2 numbers");
			return;
		}
		
		Arrays.sort(arr);
		
		//System.out.println(arr[size-2]);  --> if largest number duplicate program will fail!!
		
		for(int i = size - 2;i>=0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println("Second Largest element is " + arr[i]);
				return;
			}
		}
		System.out.println("there is no largest element");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,14,35,35,35,34,63,56,56};
		print2ndLargest(arr);

	}

}
