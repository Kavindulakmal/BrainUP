package interiewQuestions;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1, 2, 3, 4, 5};
		System.out.println("Original array");
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		
		System.out.println("Reverse Array");
		
		for(int j =arr.length-1;j>=0;j--) {
			System.out.print(arr[j]+ " ");
		}

	}

}
