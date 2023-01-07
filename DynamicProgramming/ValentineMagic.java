package DynamicProgramming;

import java.util.*;

public class ValentineMagic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int boys = sc.nextInt();
		int girls = sc.nextInt();

		int[] chocolates = new int[boys];
		int[] candies = new int[girls];

		for (int i = 0; i < boys; i++) {
			chocolates[i] = sc.nextInt();
		}

		for (int i = 0; i < girls; i++) {
			candies[i] = sc.nextInt();
		}

		int[][] dp = new int[boys][girls];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		Arrays.sort(chocolates);
		Arrays.sort(candies);

		int ans = SumofMinumumABS(chocolates, candies, 0, 0, dp);
		System.out.println(ans);
	}

	private static int SumofMinumumABS(int[] chocolates, int[] candies, int i, int j, int[][] dp) {
		if (i == chocolates.length) {
			return 0; // means all boys are paired
		}

		if (j == candies.length) {
			return 10000000; // some boys are left unpaired.
		}

		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int pick = 0, nopick = 0;

		pick += SumofMinumumABS(chocolates, candies, i + 1, j + 1, dp) + Math.abs(chocolates[i] - candies[j]);

		nopick += SumofMinumumABS(chocolates, candies, i, j + 1, dp);

		return dp[i][j] = Math.min(pick, nopick);

	}

}
