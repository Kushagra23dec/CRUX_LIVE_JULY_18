package Additional_Questions;

import java.util.Scanner;

public class Two_Path_Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int[] arr = new int[n1];
			int[] brr = new int[n2];

			for (int i = 0; i < n1; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < n2; i++) {
				brr[i] = sc.nextInt();
			}

			System.out.print(twoPath(arr, brr));

		}

	}

	public static int twoPath(int[] arr, int[] brr) {
		int ans = 0; // holds the answer
		int i = 0; // end index of arr
		int j = 0; // end index of brr
		int p = 0; // starting index of arr
		int q = 0; // starting index of brr

		while (i < arr.length && j < brr.length) {

			if (arr[i] < brr[j]) {

				i++;

			} else if (arr[i] > brr[j]) {

				j++;

			} else if (arr[i] == brr[j]) {
				int sum1 = 0; // current sum of arr
				int sum2 = 0; // current sum of brr

				// this loop itterate from p to i
				for (int k = p; k <= i; k++) {
					sum1 += arr[k];

				}

				// this loop itterate from q to j
				for (int k = q; k <= j; k++) {
					sum2 += brr[k];

				}
				ans += (int) Math.max(sum1, sum2);
				p = i + 1; // updating the starting index of arr to i+1
				q = j + 1; // updating the starting index of brr to j+1
				i++; // increasing the value of i by 1
				j++; // increasing the value of j by 1

			}

		}
		// Either i or j, any of them will end up crossing the < arr.length or
		// brr.length condition and thats why we are
		// here making shure that we get the complete sum of the array that was left
		// un-traversed

		if (i == arr.length) {
			for (int k = q; k < brr.length; k++) {
				ans += brr[k];
			}
		} else if (j == brr.length) {
			for (int k = p; k < arr.length; k++) {
				ans += arr[k];
			}
		}

		return ans;
	}

}
