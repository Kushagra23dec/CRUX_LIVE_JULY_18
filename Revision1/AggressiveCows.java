package Revision1;

import java.util.*;

public class AggressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int NoOfBarns = sc.nextInt();
		int Cows = sc.nextInt();
		int[] Barns = new int[NoOfBarns];
		for (int i = 0; i < NoOfBarns; i++) {
			Barns[i] = sc.nextInt();
		}
		Arrays.sort(Barns);

		System.out.println(LongestMinimum(Barns, Cows));

	}

	// This function will pass mid and check if it is possible or not
	public static int LongestMinimum(int[] barns, int cows) {
		int ans = 0;
		int lo = 0;
		int hi = barns[barns.length - 1] - barns[0];

		while (lo <= hi) {
			int mid = (hi + lo) / 2;

			if (isPossible(mid, barns, cows)) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}

		}

		return ans;
	}

	// isPossible
	public static boolean isPossible(int mid, int[] stall, int noc) {
		boolean f = false;
		int cow = 1;
		int pos = stall[0];
		int i = 1;
		int n = stall.length;
		while (i < n) {

			if (stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}

			if (cow == noc) {
				return true;
			}

			i++;
		}

		return false;
	}

}