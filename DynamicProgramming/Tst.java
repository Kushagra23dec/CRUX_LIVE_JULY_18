package DynamicProgramming;

import java.util.*;

import java.util.*;

public class Tst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int w = sc.nextInt();
		int[] val = new int[n];
		for (int i = 0; i < n; i++) {
			val[i] = sc.nextInt();
		}
		int[][] dp = new int[w + 1][w + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		int x = getMininumCost(val, n, w, 0, 0, dp);

		System.out.println((x == 100000) ? -1 : x);

	}

	private static int getMininumCost(int[] val, int maxItem, int cost, int maxWt, int i, int[][] dp) {

		if (maxWt == 0) {
			return cost;
		}

		if (i == val.length || maxItem == 0) {
			return 100000;
		}

		if (dp[maxItem][maxWt] != -1) {
			return dp[maxItem][maxWt];
		}

		int inc = 100000, exc = 100000;

		if (val[i] != -1 && i + 1 <= maxWt) {
			inc = getMininumCost(val, maxItem - 1, cost + val[i], maxWt - (i + 1), i, dp);

		}
		exc = getMininumCost(val, maxItem, cost, maxWt, i + 1, dp);

		return dp[maxItem][maxWt] = Math.min(inc, exc);
	}

}
