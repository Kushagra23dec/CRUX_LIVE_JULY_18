package Revision1;

import java.util.Scanner;

public class ArraysInsertionSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		insertionSort(a);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int item = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > item) {

				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = item;
		}

	}

}