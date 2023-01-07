package QueueQuestions;

import java.util.*;

public class TheQueueGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			if (isValid(arr)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}

	public static boolean isValid(int[] arr) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				if (q.isEmpty()) {
					return false;
				}

				q.poll(); // delete

			} else if (arr[i] == 1) {
				q.add(arr[i]); // insert
			}
		}

		return true;
	}

}
