package Revision1;

import java.util.*;

public class FormBiggestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			BiggestNo(arr);

			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]);
			}

		}

		sc.close();

	}

	private static void BiggestNo(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				String x = arr[i] + "";
				String y = arr[j] + "";

				if (Long.parseLong(x + y) < Long.parseLong(y + x)) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;

				}

			}
		}

	}

}
