package Revision1;

import java.util.Scanner;

public class SumOfOddPlacedAndEvenPlacedDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int c = 1;
		int odd = 0;
		int even = 0;

		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;
			if (c % 2 == 0) {
				even += rem;
			} else {
				odd += rem;
			}
			c++;

		}

		System.out.println(odd + "\n" + even);

	}

}
