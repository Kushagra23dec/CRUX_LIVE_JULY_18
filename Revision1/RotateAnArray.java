package Revision1;

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int k = sc.nextInt();
		
		sc.close();
		
		k %= n;
		rotate(arr, k);

	}

	// Array ke last 'k' elements aage aayenge rotate ho kar
	// that's why we are using n-k-1 instead of k
	// and n-k instead of k ...

	private static void rotate(int[] arr, int k) {
		int n = arr.length;
		// first call
		reverse(arr, 0, n - k - 1);

		// second call
		reverse(arr, n - k, arr.length - 1);

		// third call

		reverse(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

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
