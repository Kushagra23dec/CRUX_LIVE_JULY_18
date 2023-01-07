package LinkedListQuestions;

import java.util.Scanner;

import LinkedListQuestions.ReverseLinkedList.Node;

public class PalindromeLinkedList {

	public class Node { // Class is private and is inside Linked list class that's why it is
						// accessable...
		public int val; // current node's value
		public Node next; // reference var of next node
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

	// Reverse a linked List
	public Node ReverseList(Node list) {

		Node prev = null;
		while (list != null) {
			Node ahead = list.next;
			list.next = prev;
			prev = list;
			list = ahead;
		}

		return prev;
	}

	// get Mid
	public Node GetMid(Node list) {
		Node fast = list;
		Node slow = list;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	// Mainfunction

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		PalindromeLinkedList ll = new PalindromeLinkedList();
		int n = sc.nextInt();

		while (n-- > 0) {
			ll.addLast(sc.nextInt());
		}

		Node mid = ll.GetMid(ll.head);

		mid = ll.ReverseList(mid);

		Node first = ll.head;

		while (mid != null) {
			if (mid.val == first.val) {
				mid = mid.next;
				first = first.next;
			} else {
				System.out.println(false);
				return;
			}
		}

		System.out.println(true);

	}

}
