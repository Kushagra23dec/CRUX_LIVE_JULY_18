package LinkedListQuestions;

import java.util.*;

public class MergeSortLinkedList {

	static class Node { // Class is private and is inside Linked list class that's why it is
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

	// *****************SOLUTION STARTS FROM HERE************************

	// GET MIDDLE OF LIST
	public static Node GetMid(Node list) {
		Node fast = list;
		Node slow = list;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	// MAIN FUNCTION

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		MergeSortLinkedList ll = new MergeSortLinkedList();
		int n = sc.nextInt();

		while (n-- > 0) {
			ll.addLast(sc.nextInt());
		}

		ll.head = MergeSort(ll.head);

		ll.Display();

	}

	private static Node MergeSort(Node head) {
		// if head or head.next is null means no element or one element.

		if (head == null || head.next == null) {
			return head;
		}

		Node mid = GetMid(head);
		Node midNext = mid.next;
		mid.next = null; // here we broke the link.

		Node fs = MergeSort(head);
		Node sc = MergeSort(midNext);

		return Merge(fs,sc);

	}

	private static Node Merge(Node list1, Node list2) {
		
		Node dummy = new Node(0,null);
        Node temp = dummy;

        while(list1 !=null && list2 !=null){
            if(list1.val < list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            }else{
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }

        if(list1 !=null){
            dummy.next = list1;
        }
        if(list2 !=null){
            dummy.next = list2;
        }

      temp = temp.next;
        return temp;

	}

}
