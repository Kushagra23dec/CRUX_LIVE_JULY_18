package Revision1;

import java.util.Scanner;

public class RunningSumOfGivenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();

		if (n == 1) {
			System.out.println(arr[0]);
			return;
		}

		for (int i = 1; i < n; i++) {
			arr[i] += arr[i - 1];
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
