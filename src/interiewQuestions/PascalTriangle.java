package interiewQuestions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	
	public static List<List<Integer>> findPascalTrangle(int numRows ){
		List<List<Integer>> pascalTriangle = new ArrayList<>();
		if(numRows<=0) return pascalTriangle;
		
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		pascalTriangle.add(firstRow);
		
		for(int i=1;i<numRows;i++) {
			List<Integer> previousRow = pascalTriangle.get(i-1);
			List<Integer> currentRow = new ArrayList<Integer>();
			currentRow.add(1);
			for(int j=1;j<i;j++) {
				currentRow.add(previousRow.get(j-1)+previousRow.get(j));
			}
			
			currentRow.add(1);
			pascalTriangle.add(currentRow);
		}
		
		return pascalTriangle;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPascalTrangle(5));

	}

}
