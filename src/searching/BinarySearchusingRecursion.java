package searching;

public class BinarySearchusingRecursion {
	
	public static int binarySearch(int arr[],int first,int last,int key) {
		if(last>=first) {
			int mid = first+(last-first)/2;
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]>key) {
				return binarySearch(arr, first, mid-1, key);
			}else {
				return binarySearch(arr, mid+1, last, key);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {10,20,30,40,50}; 
		int key =30;
		int last = array.length-1;
		int result = binarySearch(array, 0, last, key);
		
		if(result ==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index: " + result);
		}

	}

}
