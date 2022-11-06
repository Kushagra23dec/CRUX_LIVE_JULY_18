package Revision1;

import java.util.Scanner;

public class DivisibleSubarrays {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(DivisibleSubArray(a));

			t--;
		}
	}

	public static long DivisibleSubArray(int[] a) {
		int n = a.length;
		long arr[] = new long[n];
		arr[0] = 1;
		long ans = 0, s = 0;
		for (int i = 0; i < n; i++) {
			s += a[i];
			int idx = (int) (s % n);
			if (idx < 0) {
				idx += n;
			}
			arr[idx] = arr[idx] + 1;
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] >= 2) {
				long p = arr[i];
				ans = ans + (p * (p - 1)) / 2;
			}
		}
		return ans;
	}
}