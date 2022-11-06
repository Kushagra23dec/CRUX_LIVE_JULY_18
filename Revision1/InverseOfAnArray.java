package Revision1;

import java.util.Scanner;

public class InverseOfAnArray {

	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int temp = a[i];
			b[temp] = i;

		}
		a = b;

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
