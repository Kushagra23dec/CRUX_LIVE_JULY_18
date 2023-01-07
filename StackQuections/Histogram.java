package StackQuections;

import java.util.*;

public class Histogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(AreaOfRect(arr));

	}

	private static long AreaOfRect(int[] arr) {
		long MaxArea = Long.MIN_VALUE;
		int h = 0, r = 0, l = 0, n = arr.length;
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				r = i; // Right Minimum
				h = arr[st.pop()]; // Height of Rectangel.

				if (st.isEmpty()) {
					MaxArea = Math.max(MaxArea, (r * h));
				} else {
					l = st.peek(); // Left Minimum.
					MaxArea = Math.max(MaxArea, (r - l - 1) * h);
				}

			}

			st.push(i);
		}

		r = n;
		while (!st.isEmpty()) {
			h = arr[st.pop()];

			if (st.isEmpty()) {
				MaxArea = Math.max(MaxArea, (r * h));
			} else {
				l = st.peek();
				MaxArea = Math.max(MaxArea, (r - l - 1) * h);
			}
		}

		return MaxArea;
	}

}
