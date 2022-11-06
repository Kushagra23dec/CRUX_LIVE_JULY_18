package Revision1;

import java.util.Scanner;

public class MaximumSumPathInTwoArrays {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();// size of array1
			int m = sc.nextInt();
			int arr1[] = new int[n];
			int arr2[] = new int[m];
			for (int i = 0; i < n; i++) {
				arr1[i] = sc.nextInt();
			}
			for (int j = 0; j < m; j++) {
				arr2[j] = sc.nextInt();
			}
			int sum = 0;
			int i = 0;
			int j = 0;
			int s1 = 0;
			int s2 = 0;
			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] < arr2[j]) {
					s1 += arr1[i++];
				} else if (arr1[i] > arr2[j]) {
					s2 += arr2[j++];

				} else if (arr1[i] == arr2[j]) {

					s1 += arr1[i];
					s2 += arr2[j];
					sum += Math.max(s1, s2);
					s1 = 0;
					s2 = 0;
					i++;
					j++;
				}
			}

			while (j < arr2.length)
				s2 += arr2[j++];

			while (i < arr1.length)
				s1 += arr1[i++];

			sum += Math.max(s1, s2);

			System.out.println(sum);
		}
		
		sc.close();

	}
}