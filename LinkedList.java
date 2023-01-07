import java.util.*;

public class LinkedList {
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
			System.out.print(t.val + "--->");
			t = t.next;
		}
		System.out.println(".");
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

	// Reverse linked list.
	public void Reverse() throws Exception {
		if (size == 0) {
			throw new Exception("List is empty");
		}
		Node curr = head;
		Node temp = curr;
		Node prev = null;
		while (curr != null) {
			Node ahead = curr.next;
			curr.next = prev;
			prev = curr;
			curr = ahead;
		}

		head = prev;
		tail = temp;
	}

	// Reverse k elements at a time.

	public void ReverseKElements(int k) {

		Stack<Node> st = new Stack<>();
		
		Node curr =head;
		
		Node prev = null;
		Node dummy = new Node();
		Node temp = dummy;
		
		while(curr!=null) {
			Node node = new Node();
			node.val = curr.val;
			st.push(node);
			if(st.size() == k) {
				while(!st.isEmpty()) {
					dummy.next = st.pop();
					dummy = dummy.next;
				}
			}
			curr = curr.next;
			
		}
		
		while(!st.isEmpty()) {
			dummy.next = st.pop();
			dummy = dummy.next;
		}
		
		this.head = temp.next;
		this.tail = dummy;
		
		

	}
	
	
	// Delete Nodes LL if a<b delete a;
	
	public void DeleteNodesLL() {
		Node temp = head;
		Node helper = new Node();
		Node hlp2 = helper;
		
		while(temp!=null && temp.next!=null) {
			if(temp.val < temp.next.val) {
				helper.next = temp.next;
				temp.next = null;
				temp = helper;
			} 
		}
		
		this.head = hlp2.next;
		
		
		
	}
	
	

	// Middle of linked list
	public int getMiddle() throws Exception {
		if (size == 0) {
			throw new Exception("List is empty");
		}

		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.val;
	}

}
