package Revision1;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = 0; j < n; j++) {
					sum += arr[(i + j) % n];
					max = Math.max(max, sum);
					if (sum < 0) {
						sum = 0;
					}
				}
			}
			if (n == 1) {
				max = arr[0];
			}
			System.out.println(max);
		}
		
		sc.close();

	}

}
