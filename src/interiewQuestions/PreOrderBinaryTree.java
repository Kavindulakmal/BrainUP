package interiewQuestions;

public class PreOrderBinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data; //Generic type
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	private void createBinaryTree() {
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		//TreeNode fifth = new TreeNode(5);
		
		root = first; // Root -->first
		first.left = second;
		first.right = third;   // second <--first-->third
		
		second.left = fourth;
		//second.right = fifth;
		
	}
	
	private void preOrder(TreeNode root) {
		
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreOrderBinaryTree bt = new PreOrderBinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
	

	}

}
