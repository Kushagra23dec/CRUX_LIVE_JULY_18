package TreeAssignmentQuestions;

import java.util.*;

public class Main {

	class Node {
		int val;
		Node left;
		Node right;

		public Node() {
			this.val = -1;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public void construct() {
		this.root = CreateTree();
	}

	Scanner sc = new Scanner(System.in);

	private Node CreateTree() {

		Queue<Node> q = new LinkedList<>();

		Node nn = new Node();
		nn.val = sc.nextInt();
		root = nn;
		q.add(root);

		while (!q.isEmpty()) {
			Node rv = q.poll();

			int c1 = sc.nextInt();
			int c2 = sc.nextInt();

			if (c1 != -1) {
				Node node = new Node();
				node.val = c1;
				rv.left = node;
				q.add(node);
			}

			if (c2 != -1) {
				Node node = new Node();
				node.val = c2;
				rv.right = node;
				q.add(node);
			}

		}

		return root;
	}

	public void levelTree() {
		levelTreeTraversal(this.root);
	}

	private void levelTreeTraversal(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<>();

		q.add(root);
		while (!q.isEmpty()) {
			Node nn = q.poll();
			System.out.print(nn.val + " ");

			if (nn.left != null)
				q.add(nn.left);

			if (nn.right != null)
				q.add(nn.right);

		}

	}

	private void displayLeafs() {
		// TODO Auto-generated method stub
		treeLeafs(this.root);

	}

	private Node treeLeafs(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return null;

		if (root.val == -1)
			return null;

		if (root.left == null && root.right == null) {
			System.out.print(root.val + " ");
			return root;
		}

		root.left = treeLeafs(root.left);
		root.right = treeLeafs(root.right);

		return root;

	}

	public static void main(String[] args) {
		Main m = new Main();

		m.construct();

		m.displayLeafs();

	}

}
