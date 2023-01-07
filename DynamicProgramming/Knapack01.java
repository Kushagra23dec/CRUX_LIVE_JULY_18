package DynamicProgramming;

import java.util.*;

public class Knapack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cap = sc.nextInt();
		int[] weight = new int[n];
		int[] cost = new int[n];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			cost[i] = sc.nextInt();
		}
		int[][] dp = new int[n][cap + 1];
		for (int[] x : dp) {
			Arrays.fill(x, -1);
		}

		int MaxCost = ZeroOneKnapsack(weight, cost, cap, 0, dp);
		System.out.println(MaxCost);
	}

	private static int ZeroOneKnapsack(int[] weight, int[] cost, int cap, int i, int[][] dp) {
		// base case
		if (i == weight.length) {
			return 0;
		}
		if (cap <= 0) {
			return 0;
		}

		// DP

		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}

		int inc = 0, exc = 0;
		// include if under capacity.
		if (cap >= weight[i]) {
			inc += cost[i] + ZeroOneKnapsack(weight, cost, cap - weight[i], i + 1, dp);
		}
		// not include.
		exc += ZeroOneKnapsack(weight, cost, cap, i + 1, dp);

		// return max of include and not include.

		return dp[i][cap] = Math.max(inc, exc);
	}

}
