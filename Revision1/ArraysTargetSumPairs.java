package Revision1;

import java.util.Scanner;

public class ArraysTargetSumPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]));
				}
			}
		}

	}

}
