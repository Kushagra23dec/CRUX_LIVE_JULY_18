package DynamicProgramming;

import java.util.Arrays;

public class DistinctSubsequences {

	public static void main(String[] args) {
		String s = "rabbbit";
		String t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];

		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		int distSubsequencesCount = DSCount(s, t, 0, 0, dp);
		System.out.println(distSubsequencesCount);
	}

	private static int DSCount(String s, String t, int i, int j, int[][] dp) {
		// base
		if (j == t.length()) {
			return 1;
		}

		if (i == s.length()) {
			return 0;
		}

		// if s's remaining length is less than t's remaining length then return.
		if (s.length() - i < t.length() - j) {
			return 0;
		}

		// dp
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		// include
		if (s.charAt(i) == t.charAt(j)) {
			inc += DSCount(s, t, i + 1, j + 1, dp);
		}
		// exclude
		exc += DSCount(s, t, i + 1, j, dp);

		// return ans, we need inc+exc;
		return dp[i][j] = inc + exc;
	}

}
