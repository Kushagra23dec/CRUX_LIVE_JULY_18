package Revision1;

import java.util.Scanner;

public class ArraysBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		bSort(a);

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

	public static void bSort(int[] a) {
		int n = a.length;
		int max = 0, c = 0;
		for (int i = 1; i < n; i++) {

			for (int j = 0; j < n - i; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					c = 1;
				}
			}

			if (c == 0) {
				break;
			}
			c = 0;
		}

	}
}