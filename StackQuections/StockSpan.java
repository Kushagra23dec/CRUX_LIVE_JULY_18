package StackQuections;

import java.util.*;

public class StockSpan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		CalculateSpan(a);

	}

	private static void CalculateSpan(int[] a) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			while (!st.isEmpty() && a[i] > a[st.peek()]) { // if stack is not empty and current array value is greater
															// than a[st.peek()]
				st.pop(); // then remove that element because a[st.peek()] is of no use now..
			}

			// calculating span
			if (st.isEmpty()) {
				ans[i] = i + 1; // it means all the elements on left side are less than current element
			} else {
				ans[i] = i - st.peek(); // it means st.peek Index value is greater than current element.
										// So, current's Index - st.peek() gives total no of elements greater than
										// current Index.
			}

			st.push(i); // push current Index into stack
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.print("END");

	}

}
