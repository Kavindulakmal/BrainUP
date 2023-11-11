package interiewQuestions;

import java.util.LinkedList;

/**
 * Given two sorted linked lists, merge them so that the resulting linked list is also sorted.
 *
 * Consider two sorted linked lists as an example.
 * linkedListOne   : 4, 8, 15, 19
 * linkedListTwo   : 7, 9, 10, 16, 18, 21
 * mergeLinkedList : 4, 7, 8, 9, 10, 15, 16, 18, 19, 21
 *
 * Runtime Complexity: O(m+n) where m and n are lengths of both linked lists
 * Memory Complexity: O(1)
 *
 */

public class MergeTwoSorterLinkedList {
	
	
	public static LinkedList<Integer> mergeLinkedList(LinkedList<Integer>linkedListOne,LinkedList<Integer>linkedListTwo){
		if(linkedListOne == null || linkedListOne.size()==0) {
			return linkedListTwo;
		}
		if(linkedListTwo== null || linkedListTwo.size()==0) {
			return linkedListOne;
		}
		
		LinkedList<Integer> mergeLinkedList = new LinkedList<Integer>();
		while(linkedListOne.size()!=0 && linkedListTwo.size()!=0) {
			if(linkedListOne.getFirst()<linkedListTwo.getFirst())
				mergeLinkedList.add(linkedListOne.removeFirst());
			else
				mergeLinkedList.add(linkedListTwo.removeFirst());
		}
		
		if(linkedListOne.size()!=0)
			mergeLinkedList.addAll(linkedListOne);
		
		if(linkedListTwo.size()!=0) {
			mergeLinkedList.addAll(linkedListTwo);
		}
		
		return mergeLinkedList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkedListOne = new LinkedList<>();
		linkedListOne.add(4);
		linkedListOne.add(8);
		linkedListOne.add(15);
		linkedListOne.add(19);
		
		LinkedList<Integer> linkedListTwo = new LinkedList<Integer>();
		linkedListTwo.add(7);
		linkedListTwo.add(9);
		linkedListTwo.add(10);
		linkedListTwo.add(16);
		linkedListTwo.add(18);
		linkedListTwo.add(21);
		
		System.out.println(mergeLinkedList(linkedListOne, linkedListTwo));
		

	}

}
