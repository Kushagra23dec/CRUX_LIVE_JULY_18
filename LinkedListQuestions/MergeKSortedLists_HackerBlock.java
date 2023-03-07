package LinkedListQuestions;

import java.util.*;

public class MergeKSortedLists_HackerBlock {

	/*
	 * Start of LinkedListCode
	 */

	private class Node {
		private int val;
		private Node next;

		public Node() {
			this.val = 0;
			this.next = null;
		}

		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
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
	public void deleteLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("List is empty!");
		}

		Node t = GetNode(size - 1);

		tail = t;
		tail.next = null;
		t = null;
		size--;

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

	/*
	 * End of LinkedListCode
	 */
	Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws Exception {

		MergeKSortedLists_HackerBlock merge = new MergeKSortedLists_HackerBlock();

		merge.KsortedInput();

	}

	private void KsortedInput() throws Exception {
		int Nolists = sc.nextInt();
		int Listsize = sc.nextInt();
		Node lists[] = new Node[Nolists];

		for (int i = 0; i < Nolists; i++) {
			Node t = new Node();
			Node temp = t;
			for (int j = 0; j < Listsize; j++) {
				Node node = new Node(sc.nextInt(), null);

				t.next = node;
				t = t.next;
				this.size++;

			}

			lists[i] = temp.next;
		}

		this.head = mergeKLists(lists);

		Display();

//		while(ans!=null) {
//			 System.out.print(ans.val+" ");
//			 ans = ans.next;
//		}
//	 

	}

	private Node mergeKLists(Node[] lists) {

		PriorityQueue<Node> pq = new PriorityQueue<>(new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o1.val - o2.val;
			}

		});

		for (Node i : lists) {
			if (i != null) {
				pq.add(i);
			}
		}

		Node dummy = new Node();
		Node temp = dummy;

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			dummy.next = node;
			dummy = dummy.next;
			if (node.next != null) {
				pq.add(node.next);
			}

		}

		// for setting Tail.
		Node x = temp.next;
		while (x.next != null) {
			x = x.next;
			if (x.next == null) {
				this.tail = x;
			}
		}

		return temp.next;
	}

}