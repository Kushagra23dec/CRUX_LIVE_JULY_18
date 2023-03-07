package DynamicProgramming;

import java.util.*;

public class Minimum_Money_Needed {

	public static final int INF = 1000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt(); // no of friends.
			int w = sc.nextInt(); // wKg of apples needed.
			int[] val = new int[w]; // values array that contains prices of apple packets.
			for (int i = 0; i < w; i++) {
				val[i] = sc.nextInt();
			}

			// [maximum packets][required Weight].
			int[][] dp = new int[w+1][w];
			for (int[] a : dp) {
				Arrays.fill(a, -1);
			}

			int x = getMininumCost(val, w, n, 0, dp);

			System.out.println((x == INF) ? -1 : x);

		}

	}

	private static int getMininumCost(int[] val, int maxWt, int maxItem, int i, int[][] dp) {

		if (maxWt == 0) {
			return 0;
		}

		if (i == val.length ) {
			return INF;
		}

		if (dp[maxWt][i] != -1) {
			return dp[maxWt][i];
		}

		int inc = INF, exc = INF;

		if (val[i] != -1 && i + 1 <= maxWt) {
			
			inc = Math.min(val[i] +getMininumCost(val, maxWt - (i + 1), maxItem - 1, i, dp), getMininumCost(val, maxWt, maxItem, i+1, dp)) ;
 
		}
		else {			
			exc = getMininumCost(val, maxWt, maxItem, i+1, dp);
		}

		return dp[maxWt][i] = Math.min(inc, exc);
	}

}
