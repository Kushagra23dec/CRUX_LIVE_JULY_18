package Revision1;

import java.util.Scanner;

public class CalculateTheSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // length of array;;;
		int[] a = new int[n];

		// assigning elements to array
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int t = sc.nextInt(); //

		while (t-- > 0) {
			int[] b = new int[n];

			int x = sc.nextInt();

			x %= n;
			for (int i = 0; i < n; i++) {

				if (i - x < 0) {
					b[i] = a[i] + a[n + i - x];
				} else {
					b[i] = a[i] + a[i - x];
				}

			}

			for (int i = 0; i < n; i++) {
				a[i] = b[i];
			}

		}
		long s = 0;

		for (int i = 0; i < n; i++) {
			s += a[i];

		}
		s = s % ((long) Math.pow(10, 9) + 7);

		int p = (int) s;

		System.out.print(p);

	}
}