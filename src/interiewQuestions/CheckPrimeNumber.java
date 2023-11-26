package interiewQuestions;

public class CheckPrimeNumber {
	
	public static boolean checkprime(int num) {
		
		if(num == 0|| num == 1) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		for(int i=2;i<= num/2;i++) {    
			if(num%i ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkprime(19));  //true
		System.out.println(checkprime(49));  //false
		System.out.println(checkprime(59));  //true
		

	}

}
