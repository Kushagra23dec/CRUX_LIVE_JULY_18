package LinkedListQuestions;

import java.util.*;

public class ImportanceOfTime {

	// Main Function...
	public static void main(String[] args) throws Exception {

		LinkedList ll = new LinkedList();

		int ans = ll.importanceofTimeFunc();

		System.out.println(ans);

	}

	// LinkedList Class...
	static class LinkedList {
		private class Node {
			private int val;
			private Node next;

			public Node() {
				this.val = 0;
				this.next = null;
			}
		}

		// HEAD OF LINKED-LIST { PRIVATE MEMBER OF LINKED-LIST-CLASS REFER TO FIRST
		// ELEMENT IN LIST}
		private Node head;
		// TAIL OF LINKED-LIST { PRIVATE MEMBER OF LINKED-LIST-CLASS REFER TO LAST
		// ELEMENT IN LIST }
		private Node tail;

		private int size;

		// ADD FIRST
		public void addFirst(int item) {
			if (head == null) {
				Node node = new Node();
				node.val = item;
				head = node;
				tail = head;
				size++;
			} else {
				Node node = new Node();
				node.val = item;
				node.next = head;
				head = node;
				node = null;
				size++;

			}
		}

		// ADD LAST
		public void addLast(int item) {
			if (head == null) {
				Node node = new Node();
				node.val = item;
				head = node;
				tail = head;
				node = null;
				size++;
			} else {
				Node node = new Node();
				node.val = item;
				tail.next = node;
				tail = node;
				node = null;
				size++;
			}
		}

		// DELETE FIRST
		public int deleteFirst() throws Exception {
			if (isEmpty()) {
				throw new Exception("List is empty!");
			}

			Node t = head;
			head = head.next;
			t.next = null;
			size--;

			return t.val;

		}

		// DELETE LAST
		public int deleteLast() throws Exception {
			if (isEmpty()) {
				throw new Exception("List is empty!");
			}

			Node t = GetNode(size - 1);
			int item = t.next.val;
			tail = t;
			tail.next = null;
			t = null;
			size--;

			return item;

		}

		// DISPLAY
		public void Display() throws Exception {
			if (isEmpty()) {
				throw new Exception("List is empty!");
			}

			Node t = head;
			while (t != null) {
				System.out.print(t.val + " ");
				t = t.next;
			}
			System.out.println();
		}

		// GETNODE
		public Node GetNode(int k) throws Exception {
			if (k > size || k < 1) {
				throw new Exception("Invalid index");
			}

			if (k == 1) {
				return head;
			}

			if (k == size) {
				return tail;
			}

			Node t = head;

			for (int i = 2; i <= k; i++) {
				t = t.next;
			}

			return t;
		}

		// INSERT AT INDEX
		public void InsertAtIndex(int k, int item) throws Exception {
			if (isEmpty()) {
				throw new Exception("List is empty!");
			}
			if (k == 1) {
				addFirst(item);
				return;
			}
			if (k == size + 1) {
				addLast(item);
				return;
			}

			Node t = GetNode(k - 1);

			Node t2 = new Node();
			t2.val = item;

			t2.next = t.next;

			t.next = t2;

			size++;

		}

		// SIZE
		public int size() {

			return this.size;
		}

		// isEmpty
		public boolean isEmpty() {
			return this.size == 0;
		}

		// Code Starts From Here....
		Scanner sc = new Scanner(System.in);

		public int importanceofTimeFunc() {
			int ans = 0;
			int n = sc.nextInt();

			Node callingOrder = new Node();

			Node call = callingOrder;

			for (int i = 0; i < n; i++) {
				Node t = new Node();
				t.val = sc.nextInt();
				callingOrder.next = t;
				callingOrder = callingOrder.next;

			}
			callingOrder = call.next;

			Node idealOrder = new Node();

			Node idea = idealOrder;

			for (int i = 0; i < n; i++) {
				Node t = new Node();
				t.val = sc.nextInt();
				idealOrder.next = t;
				idealOrder = idealOrder.next;
			}

			idealOrder = idea.next;

			while (callingOrder != null) {

				if (callingOrder.val == idealOrder.val) {
					ans++;
					callingOrder = callingOrder.next;
					idealOrder = idealOrder.next;
				} else {
					Node temp = callingOrder;
					Node templast = callingOrder;
					callingOrder = callingOrder.next;
					while (templast.next != null) {
						templast = templast.next;

					}
					temp.next = null;
					templast.next = temp;

					ans++;

				}

			}

			return ans;
		}

	}

}
