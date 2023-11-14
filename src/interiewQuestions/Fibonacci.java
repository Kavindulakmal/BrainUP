package interiewQuestions;

public class Fibonacci {
//0 1 1 2 3 5....n
	
	public static void fibonacci(int n) {
		
		int num1 =0, num2=1;
		int counter =0;
		
		while(counter <n ) {
			System.out.println(num1 + " ");
			
			int num3 = num1+num2;
			num1 =num2;
			num2 =num3;
			
			counter+=1;  //counter=counter+1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		fibonacci(n);

	}

}
