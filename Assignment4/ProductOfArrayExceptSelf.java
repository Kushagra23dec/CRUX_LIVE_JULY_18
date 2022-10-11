package Assignment4;

import java.util.Scanner;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		productExceptSelf(a);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void productExceptSelf(int[] a) {
		int n = a.length;

		int[] leftProduct = new int[n];
		int[] rightProduct = new int[n];

		leftProduct[0] = 1;
		for (int i = 1; i < n; i++) {
			leftProduct[i] = a[i-1] * leftProduct[i - 1];
		}

		rightProduct[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			rightProduct[i] = a[i+1] * rightProduct[i + 1];
		}

		for (int i = 0; i < n; i++) {
			a[i] = rightProduct[i] * leftProduct[i];
		}

	}

}
