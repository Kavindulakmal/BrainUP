package pattern;
/*
 * out put should be
 * 	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
 */

public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			System.out.println(" ");
		}

	}

}
