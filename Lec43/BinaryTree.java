package Lec43;

import java.util.*;

public class BinaryTree {
	private class Node {
		private int val;
		private Node left;
		private Node right;

		public Node() {
			this.val = 0;
			this.left = null;
			this.right = null;
		}

		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;

	public void BinaryTree() {
		this.root = createTree();
	}

	Scanner sc = new Scanner(System.in);

	private Node createTree() {
		
		Node node = new Node();
		
		int item = sc.nextInt();
		node.val = item;

		
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			node.left = createTree();
		}

		
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			node.right = createTree();
		}

		
		return node;
	}

	// PRE-ORDER TRAVERSAL... 	N,L,R
	public void preTraversal() {
		preTraversal(root);
	}

	private Node preTraversal(Node node) {

		if (node == null) {
			return null;
		}

		System.out.print(node.val + " ");

		preTraversal(node.left);
		preTraversal(node.right);

		return node;
	}
	
	public void TraverseLevel() {
		LevelOrder(this.root);
	}
	// LEVEL-ORDER TRAVERSAL...
   //  Queue>Dequeue>Printvalue>Enquue
	private void LevelOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<>();
		
		q.add(node);
		
		while(!q.isEmpty()) {
			Node nn = q.poll();
			System.out.print(nn.val+" ");
			if(nn.left!=null) {
				q.add(nn.left);
			}
			
			if(nn.right!=null) {
				q.add(nn.right);
			}
			
		}

		System.out.println("END");
		
	}
	
	

}
