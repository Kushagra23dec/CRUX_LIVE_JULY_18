package DynamicProgramming;

import java.util.*;

public class UniquePaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean[][] board = new boolean[m][n];
		int[][] dp = new int[m][n];
		for(int[] i: dp) {
			Arrays.fill(i, -1);
		}
		int ans = UniquePath(0, 0, board, dp);

		System.out.println(ans);

	}

	private static int UniquePath(int m, int n, boolean[][] board, int[][] dp) {

		if (m == board.length - 1 && n == board[0].length - 1) {
			return 1;
		}

		if (m > board.length - 1 || n > board[0].length - 1) {
			return 0;
		}
		if (dp[m][n] != -1) {
			return dp[m][n];
		}

		int a = 0, b = 0;
		if (m < board.length && !board[m][n]) {

			a += UniquePath(m + 1, n, board, dp);

		}
		if (n < board[0].length && !board[m][n]) {

			b += UniquePath(m, n + 1, board, dp);

		}

		return dp[m][n] = a + b;
	}

}
