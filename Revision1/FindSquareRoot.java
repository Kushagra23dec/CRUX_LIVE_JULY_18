package Revision1;

import java.util.Scanner;

public class FindSquareRoot {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(BinarySearch(n));

	}

	public static long BinarySearch(int n) {

		long lo = 0, hi = n;
		long m = 0;

		while (lo <= hi) {
			m = lo + (hi - lo) / 2;
			if (m * m == n) {
				return m;
			} else if (m * m > n) {
				hi = m - 1;
			} else if (m * m < n) {
				lo = m + 1;
			}

		}

		return hi;
	}

}