package pattern;
/*
 * Output should be
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 */

public class Pattern08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<=4;i++) {
			for(int j =0;j<=i;j++) {
				System.out.print(""+(char)(65+i));
			}
			System.out.println("");	
		}
		

	}

}
