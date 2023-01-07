package StackQuections;

import java.util.*;

public class FindTheGreaterElement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		sc.close();

		GreaterElement(arr);

	}

	// Function to print The Greater Element for each element of the array.
	// Array is cyclic...
	public static void GreaterElement(int[] arr) {

// Write Code here
		Stack<Integer> st = new Stack<Integer>();

		int n = arr.length;

		int[] ans = new int[n];

		// This loop finds the next greater element.
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i]; // if Condition is true, then save the result.
			}

			st.push(i); // if while condition is not fullfill, Push Index into stack.
		}

		// This loop finds Greater element for the elements that are left in stack.
		for (int i = 0; i < n - 1; i++)
			while (!st.isEmpty() && i < st.peek() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}

		// Finally if There are still some elements left in stack.
		// That means there is no Greater Element for them. So, put -1.
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		// Print The Result.
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}
