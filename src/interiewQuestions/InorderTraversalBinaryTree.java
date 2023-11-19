package interiewQuestions;

import java.util.Stack;

//Inorder traversal of Binary Tree
public class InorderTraversalBinaryTree {
	
	private TreeNode root;
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data; //Generic type
		
		
		public TreeNode(int data) {
			this.data = data;
		}
		
	}
	
	private void CreateBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
	}
	
	private void preOrder() {
		if(root == null) {
			return ;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data +" ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		}
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InorderTraversalBinaryTree bt = new InorderTraversalBinaryTree();
		bt.CreateBinaryTree();
		bt.inOrder(bt.root);

	}

}
