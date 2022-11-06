package Revision1;

import java.util.*;

public class ArraysMaxValueInArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();

		int max = 0;

		for (int i = 1; i < n; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}

		System.out.println(a[max]);

	}
}