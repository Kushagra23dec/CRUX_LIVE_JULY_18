package Revision1;

import java.util.Scanner;

public class MurthalParantha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();

		int n = sc.nextInt();

		int[] tarray = new int[n];

		for (int i = 0; i < n; i++) {
			tarray[i] = sc.nextInt();
		}

		System.out.println(binarySearch(p, tarray));

	}

	public static long binarySearch(int p, int[] a) {
		int x = a.length - 1;
		int lo = 0;
		int hi = a[x];
		int s = hi;
		int maxel = a[0];

		for (int i = 0; i < a.length; i++) {
			maxel = Math.max(maxel, a[i]);
		}

		hi = maxel;
		s = hi;

		for (int i = 0; i < p; i++) {
			s = s + maxel;
			hi += s;
		}

		int ans = hi;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (isPossible(p, a, mid)) {
				ans = Math.min(mid, ans);
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		return ans;
	}

	// ispossible
	public static boolean isPossible(int p, int[] a, int mid) {
		int total = 0;

		for (int i = 0; i < a.length; i++) {

			int sum = 0, itr = a[i];
			while (sum + itr <= mid) {

				sum = sum + itr;
				itr = itr + a[i];

				total++;

				if (total == p) {
					return true;
				}

			}

		}

		return false;
	}

}