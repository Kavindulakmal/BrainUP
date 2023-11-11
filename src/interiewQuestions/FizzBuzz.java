package interiewQuestions;
//Todo
/**take numbers from 1 to 100 and
 * if 
 * i%3 ==0 -> fizz
 * if i%5 ==0 ->buzz
 * if i%3 ==0 && i%5==0-> fizzbuzz
 * else print(i)
 * @author Kavindu
 *
 */
public class FizzBuzz {
	
	
	public static void printFizzBuzz(int n) {
		
		for(int i=1;i<=n;i++) {
			if((i%3 ==0)&&(i%5==0)) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int n =100;
		printFizzBuzz(100);

		
	}

}
