package StackQuections;

import java.util.*;

public class KartikBhaiyaAndTheCelebrityProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		int x = CelebrityProblem(mat);
		if (x == -1) {
			System.out.println("No Celebrity");
		} else {
			System.out.println(x);
		}
	}

	private static int CelebrityProblem(int[][] mat) {
		int ans = 0;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < mat.length; i++) {
			st.push(i);
		}

		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (mat[a][b] == 1) {
				st.push(b); // 'a' Knows 'b' , so 'a' is not a celebrity.
			} else {
				st.push(a); // 'a' could be celebrity. because he doesn't know 'b'.
			}
		}
		int celebrity = st.pop(); // once the loop finish there will be only one element in stack.

		for (int i = 0; i < mat.length; i++) {
			if (i != celebrity && (mat[celebrity][i] == 1 || mat[i][celebrity] == 0)) {
				return -1; // 'celebrity' knows some one that means it is not a celebrity.
							// or someone not know celebrity, that also makes him not a celebrity.
			}
		}

		return celebrity;
	}

}
