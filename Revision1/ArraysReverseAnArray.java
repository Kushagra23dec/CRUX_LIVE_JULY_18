package Revision1;

import java.util.Scanner;

public class ArraysReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		int i = 0, j = n - 1;
		while (i < j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}

		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
