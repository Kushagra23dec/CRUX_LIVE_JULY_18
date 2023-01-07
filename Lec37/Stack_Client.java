package Lec37;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		Stack st = new Stack();

		// System.out.println(st.size());

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		 
		
		
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		 st.push(60);
		
		st.Display();

		System.out.println(st.isEmpty());

		System.out.println(st.isFull());

		System.out.println(st.size());

	}

}
