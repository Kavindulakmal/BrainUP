package pattern;
/*
 * out put should be 
 *  *
   ***
  *****
 *******
*********
 */

public class Pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size =5;
		//System.out.println();
		int i,j,k;
		for(i=0;i<=size;i++) {
			for(j=size;j>i;j--) {
				System.out.print(" ");
			}
			for(k=0;k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	   }  

}
