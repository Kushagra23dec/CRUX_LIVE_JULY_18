package Revision1;

import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			nextPermut(arr);

			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}

			System.out.println();

		}

		sc.close();

	}

	private static void nextPermut(int[] arr) {
		int p = 0;
		int q = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}

		if (p == 0 && q == 0) {
			reverse(arr, 0, arr.length - 1);
			return;
		}

		int t = arr[p];
		arr[p] = arr[q];
		arr[q] = t;

		reverse(arr, p + 1, arr.length - 1);

	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {

			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;

			i++;
			j--;
		}

	}

}
