package Revision1;

import java.util.*;

public class PairOfRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		// no of test cases
		while (times-- > 0) {

			// capacity of array
			int n = sc.nextInt();
			int[] a = new int[n];

			// filling the array
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			int sum = sc.nextInt();

			DeepakShould(a, n, sum);

		}
		sc.close();

	}

	private static void DeepakShould(int[] a, int n, int sum) {
		int d = Integer.MAX_VALUE;
		int x = 0, y = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum) {
					if (Math.abs(a[j] - a[i]) < d) {
						x = i;
						y = j;
						d = Math.abs(a[j] - a[i]);
					}
				}
			}
		}

		System.out.println("Deepak should buy roses whose prices are " + Math.min(a[x], a[y]) + " and "
				+ Math.max(a[x], a[y]) + ".");

	}

}
