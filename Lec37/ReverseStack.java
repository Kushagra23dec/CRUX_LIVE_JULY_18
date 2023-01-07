package Lec37;

import java.util.*;

public class ReverseStack {

	public static void main(String[] args) throws Exception {
		Stack st = new Stack(10);

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);

		st.Display();

		//int item = 5;
		//InsertDown(st, item);
		reverse(st);
		st.Display();

	}
	
	
	private static void reverse(Stack st) throws Exception {
		if(st.isEmpty()) {
			return;
		}
		int item = st.pop();
		reverse(st);
	    
		InsertDown(st,item);
	}
	
	

	private static void InsertDown(Stack st, int item) throws Exception {
		if (st.isEmpty()) {
			st.push(item);
			return;
		}

		int i = st.pop();
		InsertDown(st, item);
		st.push(i);

	}

}
