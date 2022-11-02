package Revision1;

import java.util.Scanner;

// A no that is not divisible by cb, and is not 0 or 1, is a CB no.
// Our aim is to find a maximum no of cb numbers.
// so we will loop from last 
// we will also maintain a boolean array that will 
// tell if we have used this no or not.

public class FindingCBNumber {

	public static int[] cb = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int c = 0;
		String str = sc.next();

		sc.close();

		boolean[] Visited = new boolean[n];

		// This i'th loop runs from last digit, and goes till first digit.
		for (int i = str.length() - 1; i >= 0; i--) {
			// This j'th loop initialize from last no always. till it gets equal to i.
			for (int j = str.length() - 1; j >= i; j--) {
				// St holds the substring from i to j+1;
				String st = str.substring(i, j + 1);
				if (isVisited(i, j, Visited) && isCbNo(Integer.parseInt(st))) {

					c++;
					// once the no is a valid cb no, we'll mark current numbers from i to j as
					// visited.
					for (int k = i; k <= j; k++) {
						Visited[k] = true;
					}

				}

			}
		}

		// Finally We'll print the result.
		System.out.println(c);

	}

	// Is Visited Check if the Values in the range are used already or not. if even
	// one of them is used then this substring is of no use
	private static boolean isVisited(int i, int j, boolean[] Visited) {

		for (; i <= j; i++) {
			if (Visited[i]) {
				return false;
			}
		}
		return true;
	}

	// This method checks if the no is a cb no or not...
	private static boolean isCbNo(int val) {

		if (val == 1 || val == 0) {
			return false;
		}

		for (int i : cb) {
			if (val == i) {
				return true;
			}
		}

		for (int i : cb) {
			if (val % i == 0) {
				return false;
			}
		}

		return true;
	}

}
