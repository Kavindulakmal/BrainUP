package pattern;
/* output should be 
 * 
 * 	1
	2   3
	4   5   6
	7   8   9   10
 */

public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		for(int i =1;i<=5;i++) {
			for(int j =1;j<i;j++) {
				System.out.print(a++ +"\t");
			}
			System.out.println();
		}

	}

}
