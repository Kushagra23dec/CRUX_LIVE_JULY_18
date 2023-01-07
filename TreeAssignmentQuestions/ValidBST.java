package TreeAssignmentQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	static class BinaryTreeFromLvlOrder {

		private Scanner s = new Scanner(System.in);

		private class Node {
			int val;
			Node left;
			Node right;

			public Node(int val) {
				this.val = val;
			}
		}

		private Node root;

		public BinaryTreeFromLvlOrder() {
			// TODO Auto-generated constructor stub
			root = construct();// 2k
		}

		private Node construct() {
			// TODO Auto-generated method stub

			int val = s.nextInt();
			Node nn = new Node(val);
			Queue<Node> lvl = new LinkedList<>();
			lvl.add(nn);

			while (!lvl.isEmpty()) {
				Node front = lvl.remove();
				int a = s.nextInt();
				int b = s.nextInt();

				if (a != -1) {
					Node na = new Node(a);
					front.left = na;
					lvl.add(na);
				}

				if (b != -1) {
					Node nb = new Node(b);
					front.right = nb;
					lvl.add(nb);
				}
			}
			return nn;// 2k
		}

		// solution starts From here, all the way down...
		private boolean isValid() {

			return ValidOrNot(root).isbst;
		}

		public BstPair ValidOrNot(Node root) {
			if (root == null) {
				return new BstPair(); // single node is always, a valid bst.
			}

			BstPair lbstp = ValidOrNot(root.left);
			BstPair rbstp = ValidOrNot(root.right);
			BstPair sbstp = new BstPair();

			sbstp.min = Math.min(root.val, Math.min(lbstp.min, rbstp.min));
			sbstp.max = Math.max(root.val, Math.max(lbstp.max, rbstp.max));

			if (lbstp.isbst && rbstp.isbst && lbstp.max < root.val && rbstp.min > root.val) {
				sbstp.isbst = true;
			} else {
				sbstp.isbst = false;
			}

			return sbstp;

		}

		// BstPair class
		class BstPair {
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			boolean isbst = true;
		}

	}

	public static void main(String[] args) {
		BinaryTreeFromLvlOrder bt = new BinaryTreeFromLvlOrder();
		System.out.println(bt.isValid());
	}
}
