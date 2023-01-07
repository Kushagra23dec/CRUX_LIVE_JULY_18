package TimeAndSpace;

import java.util.Scanner;

public class Divisiblesub {

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

	private static long DivisibleSubArray(int[] a) {
		long ans = 0;
		long sum = 0;
		int n = a.length, idx = 0;
		long[] arr = new long[n];
		arr[0] = 1;
		for (int i = 0; i < n; i++) {

			sum += a[i];
			idx = (int) sum % n;

			if (idx < 0) {
				idx += n;
			}

			arr[idx] += 1;

		}

		for (int i = 0; i < n; i++) {
			if (arr[i] >= 2) {
				ans += (arr[i] * (arr[i] - 1)) / 2;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		return ans;
	}

}
