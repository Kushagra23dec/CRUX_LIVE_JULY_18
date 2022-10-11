package Assignment7_BSQ;

import java.util.Arrays;
import java.util.Scanner;

public class Painter_Partition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
		}

		System.out.println(binarySearch(k, l));

	}

	public static int binarySearch(int k, int[] l) {
		int ans = Integer.MAX_VALUE;
		int x = 0;
		for (int v : l) {
			x += v;
		}

		int hi = x;

		for (int v : l) {
			x = Math.min(x, v);
		}

		int lo = x;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (isPossible(k, l, mid)) {
				ans = Math.min(ans, mid);
				hi = mid - 1;

			} else {

				lo = mid + 1;
			}
		}

		return ans;
	}

	public static boolean isPossible(int k, int[] l, int mid) {

		int paint = 0;
		int i = 0;

		int p = 0;

		while (i < l.length) {

			if (paint + l[i] <= mid) {
				paint += l[i];
				i++;
			} else {
				p++;
				paint = 0;
			}

			if (p >= k) {

				return false;
			}
		}

		return true;
	}

}
