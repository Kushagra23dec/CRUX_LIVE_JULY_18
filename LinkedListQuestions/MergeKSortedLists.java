package LinkedListQuestions;

import java.util.*;

public class MergeKSortedLists {

	   public class ListNode {
		       int val;
		       ListNode next;
		       ListNode() {}
		       ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
	
	public static void main(String[] args) {
		
	}
	
	
	public ListNode mergeKLists(ListNode[] lists) {

		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<>() {

			@Override
			public int compare(ListNode o1, ListNode o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
			
		});

		for (ListNode i : lists) {
			if (i != null) {
				pq.add(i);
			}
		}

		ListNode dummy = new ListNode();
		ListNode temp = dummy;

		while (!pq.isEmpty()) {
			ListNode node = pq.poll();
			dummy.next = node;
			dummy = dummy.next;
			if(node.next!=null) {
				pq.add(node.next);
			}

		}

		return temp.next;
	}

}