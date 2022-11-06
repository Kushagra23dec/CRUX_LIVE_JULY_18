package Revision1;

import java.util.Scanner;

public class SortingInLinearTime {
	// Main function
	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sortIt(a);

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

	// Sort function DNF
	public static void sortIt(int[] arr) {
		int n = arr.length;
		int i = 0, k = 0, j = n - 1;
		int temp = 0;
		while (k <= j) {

			// for 2
			if (arr[k] == 2) {
				temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j--;
			} else if (arr[k] == 0) {
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				i++;
				k++;
			} else {
				k++;
			}
		}
	}

}
