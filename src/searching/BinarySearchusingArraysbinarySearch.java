package searching;

import java.util.Arrays;

public class BinarySearchusingArraysbinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] ={10,20,30,40,50};  
		int key = 30;
		int result = Arrays.binarySearch(arr, key);
		
		if(result<0) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element fount at index :"+result);
		}

	}

}
