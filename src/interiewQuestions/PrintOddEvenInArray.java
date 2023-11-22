package interiewQuestions;
/*
 * each element and checking if it is divided by 2 or not. If it is divided by 2, 
 * it is even number otherwise it is odd number.
 */
public class PrintOddEvenInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {1,2,5,6,3,2,4,11};
		
		System.out.println("Odd Numbers");
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Even Numbers");
		for(int j =0;j<arr.length;j++) {
			if(arr[j]%2==0) {
				System.out.println(arr[j]);
			}
		}
		

	}

}
