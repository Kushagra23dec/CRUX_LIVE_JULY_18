package LinkedListQuestions;

import java.util.Scanner;

import LinkedListQuestions.ReverseLinkedList.Node;

public class Sum_of_two_Linked_Lists {

	private static class Node { // Class is private and is inside Linked list class that's why it is
		// accessable...
		private int val; // current node's value
		private Node next; // reference var of next node

		public Node() {
			this.val = 0;
			this.next = null;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}

	}

	private Node head; // head points to the first node
	private Node tail;
	private int size = 0;

// Add First
	public void addFirst(int item) {
		if (size == 0) {
			head = new Node();
			head.val = item;
			head.next = null;
			tail = head;
			size++;
		} else {
			Node t = new Node();
			t.next = head;
			t.val = item;
			head = t;
			size++;
		}
	}

// addLast
	public void addLast(int item) {
		if (size == 0) {
			head = new Node();
			head.val = item;
			head.next = null;
			tail = head;
			size++;

		} else {
			Node t = new Node();
			t.val = item;
			t.next = null;
			tail.next = t;
			tail = t;
			size++;

		}
	}

// Get Last
	public int getLast() throws Exception {
		if (size == 0) {
			throw new Exception("List is empty");
		}
		return tail.val;
	}

// Get First
	public int getFirst() throws Exception {
		if (size == 0) {
			throw new Exception("List is empty");
		}

		return head.val;
	}

// Delete first
	public int DeleteFirst() throws Exception {
		if (size == 0) {
			throw new Exception("List is Empty");
		}
		int t = head.val;
		head = head.next;
		size--;
		return t;
	}

// Deleate Last
	public int DeleteLast() throws Exception {
		if (size == 0) {
			throw new Exception("List is Empty");
		}
		int t = tail.val;

		Node t2 = GetNode(size - 2);

		tail = t2;
		tail.next = null;

		size--;

		return t;
	}

// GetNode
	public Node GetNode(int k) throws Exception {
		if (size == 0) {
			throw new Exception("List is Empty");
		}

		if (k < 0) {
			throw new Exception("Index cannot be -ve");
		}

		int idx = 0;
		Node t = new Node();
		t = head;

		while (idx != k) {
			t = head.next;
			idx++;
		}

		return t;
	}

// Insert At Any Index

	public void InsertAtAny(int k, int item) throws Exception {

		if (k == 0) {
			addFirst(item);
			return;
		}
		if (k == size) {
			addLast(item);
			return;
		}

		if (k < 0 || k > size) {
			throw new Exception("index is out of bound");
		}

		Node t = GetNode(k - 1);

		Node t2 = new Node();

		t2.val = item;

		t2.next = t.next;

		t.next = t2;

		size++;

	}

// Display
	public void Display() throws Exception {
		if (size == 0) {
			throw new Exception("List is empty !!");

		}
		Node t = new Node();
		t = head;

		while (t != null) {
			System.out.print(t.val + " ");
			t = t.next;
		}
		System.out.println();
	}

	public int GetSize() {
		return size;
	}

	// ***************Solution***************
	// Sum of two linked list.
	// Approach:-
	// first reverse both linked lists.
	// then add them
	// then reverse the result
	// print the result.

	public static void main(String[] args) throws Exception {
		Sum_of_two_Linked_Lists l1 = new Sum_of_two_Linked_Lists();
		Sum_of_two_Linked_Lists l2 = new Sum_of_two_Linked_Lists();
		Sum_of_two_Linked_Lists result = new Sum_of_two_Linked_Lists();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		while (n-- > 0) {
			l1.addFirst(sc.nextInt());
		}

		while (m-- > 0) {
			l2.addFirst(sc.nextInt());
		}

		Node first = l1.head;
		Node second = l2.head;

		int sum = 0, carry = 0;

		while (first != null && second != null) {
			sum = (first.val + second.val + carry) % 10;
			carry = (first.val + second.val + carry) / 10;

			result.addFirst(sum);

			first = first.next;
			second = second.next;

		}

		while (first != null) {
			sum = (first.val + carry) % 10;
			carry = (first.val + carry) / 10;

			result.addFirst(sum);
			first = first.next;

		}

		while (second != null) {
			sum = (second.val + carry) % 10;
			carry = (second.val + carry) / 10;

			result.addFirst(sum);
			second = second.next;

		}

		if (carry == 1) {
			result.addFirst(carry);
		}

		result.Display();

	}

//	// Reverse a linked List
//		public Node reverse(Node list) {
//
//			Node prev = null;
//			while (list != null) {
//				Node ahead = list.next;
//				list.next = prev;
//				prev = list;
//				list = ahead;
//			}
//
//			return prev;
//		}

}
