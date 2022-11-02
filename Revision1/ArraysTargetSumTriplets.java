package Revision1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTargetSumTriplets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int t = sc.nextInt();
		
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == t) {

						int[] temp = new int[3];
						temp[0] = arr[i];
						temp[1] = arr[j];
						temp[2] = arr[k];

						Arrays.sort(temp);

						System.out.println(temp[0] + ", " + temp[1] + " and " + temp[2]);

					}
				}
			}
		}

	}

}
