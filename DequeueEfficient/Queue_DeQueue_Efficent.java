package DequeueEfficient;

import java.util.*;

public class Queue_DeQueue_Efficent {

	Stack<Integer> st = new Stack<>();

	// O(1)
	public boolean isEmpty() {
		return st.isEmpty();
	}

	// O(1)
	public int size() {
		return st.size();
	}
	// O(1)
	public int getFront() {
		return st.peek();
	}

	// O(1)
	public int Dequeue() {
		int item = st.pop();
		return item;
	}
	
	// Summary:- 
//	first empty the original stack and store it in a hlp Stack.
//	second push the item in original stack.
//	third empty the hlp stack in original stack.

	// O(N)
	public void Enqueue(int item) {
		Stack<Integer> hlp = new Stack<>();
		
		while(!st.isEmpty()) {
			hlp.push(st.pop());
		}
		
		st.push(item);
		
		while(!hlp.isEmpty()) {
			st.push(hlp.pop());
		}
		
		
	}
	
	
	

	public static void main(String args[]) {
		Queue_DeQueue_Efficent q = new Queue_DeQueue_Efficent();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			q.Enqueue(i);
		}

		while (!q.isEmpty()) {
			System.out.print(q.Dequeue() + " ");
		}
	}
}
