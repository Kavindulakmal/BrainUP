package interiewQuestions;
/*
 *  	/5/ 
       /   \ 
     /2/   /9/ 
    / 	   / \ 
   /1/ 	  /8/ /6/ 
    * 
    * For the given tree, sum of nodes of the binary tree will be 1 + 2 + 5 + 8 + 6 + 9 = 31.
 */

public class SumOfBinaryTree {
	
	public Node root;  
	
	public static class Node{
		Node left;
		Node right;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public SumOfBinaryTree() {
		root = null;
	}
	
	public int calculateSum(Node temp) {
		int sum, sumleft, sumright;
		sum = sumright = sumleft =0;
		
		if (root == null) {
			System.out.println("Tree is Empty");
			return 0;
		}
		else {
			if(temp.left!=null) {
				sumleft = calculateSum(temp.left);
			}
			
			if(temp.right !=null) {
				sumright =calculateSum(temp.right);
			}
		sum = temp.data + sumleft+sumright;
		return sum;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfBinaryTree bt = new SumOfBinaryTree();
		
		bt.root = new Node(5);
		bt.root.left = new Node(2);  
        bt.root.right = new Node(9);  
        bt.root.left.left = new Node(1);  
        bt.root.right.left = new Node(8);  
        bt.root.right.right = new Node(6);  
        
        System.out.println(bt.calculateSum(bt.root));

	}

}
