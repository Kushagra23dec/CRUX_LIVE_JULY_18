package Revision1;

import java.util.Scanner;

public class KTHROOT {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		while (testcases-- > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			System.out.println(BinarySearch(n, k));

		}

	}

	public static long BinarySearch(long n, int k) {

		long lo = 0, hi = n;
		while (lo <= hi) {
			long m = lo + (hi - lo) / 2;
			if ((long) Math.pow(m, k) == n) {
				// System.out.print(m);
				return m;
			} else if ((long) Math.pow(m, k) > n) {
				hi = m - 1;
			} else if ((long) Math.pow(m, k) < n) {
				lo = m + 1;
			}

		}

		return hi;
	}
}