package Revision1;

import java.util.Scanner;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		
		sc.close();

		int idx = BinarySearch(arr, m);
		System.out.println(idx);
	}

	private static int BinarySearch(int[] arr, int m) {

		int n = arr.length;

		int lo = 0, hi = n - 1;

		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;

			if (arr[mid] == m) {
				return mid;
			} else if (arr[mid] < m) {
				lo = mid + 1;
			} else if (arr[mid] > m) {
				hi = mid - 1;
			}
		}

		return -1;
	}

}
