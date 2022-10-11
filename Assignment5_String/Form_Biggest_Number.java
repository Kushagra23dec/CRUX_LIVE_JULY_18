package Assignment5_String;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_Number {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			// Arrays.sort(a);

			ReturnBiggestNo(a);
			for (int i = 0; i < n; i++) {

				System.out.print(a[i]);

			}

			System.out.println();
		}
	}

//		54 546 548 60
	
	
	
	
	// this function compairs two numbers,; it works like sorting it swaps two elements that are small ans create a larger no after swapping

	public static void ReturnBiggestNo(int[] a) {

		for (int i = 0; i < a.length; i++) {
			String x = "", y = "";
			for (int j = i + 1; j < a.length; j++) {

				x = "" + a[i];
				y = "" + a[j];

				if (Long.parseLong(x + y) < Long.parseLong(y + x)) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}

	}

}
