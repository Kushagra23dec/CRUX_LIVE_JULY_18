package Revision1;

import java.util.*;

public class ArraysSumOfTwoArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a1 = new int[n];
		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int[] a2 = new int[m];

		for (int i = 0; i < m; i++) {
			a2[i] = sc.nextInt();
		}
		
		sc.close();
		
		int carry = 0;
		int sum = 0;

		int[] ans = new int[Math.max(n + 1, m + 1)];
		int i = n - 1;
		int j = m - 1;
		int k = 0;
		while (i >= 0 && j >= 0 && k < ans.length) {

			sum = (a1[i] + a2[j] + carry) % 10;
			carry = (a1[i] + a2[j] + carry) / 10;

			ans[k] = sum;
			k++;
			i--;
			j--;
		}

		while (i >= 0 && k < ans.length) {
			sum = (a1[i] + carry) % 10;
			carry = (a1[i] + carry) / 10;
			ans[k] = sum;
			k++;
			i--;
		}

		while (j >= 0 && k < ans.length) {
			sum = (a2[j] + carry) % 10;
			carry = (a2[j] + carry) / 10;
			ans[k] = sum;
			k++;
			j--;
		}

		if (carry == 1) {
			ans[k] = carry;
			k++;

			for (i = k - 1; i >= 0; i--) {
				System.out.print(ans[i] + ", ");
			}

			System.out.println("END");
			return;

		}

		for (i = k - 1; i >= 0; i--) {
			System.out.print(ans[i] + ", ");
		}

		System.out.println("END");

	}

}
