package Revision1;

import java.util.Scanner;

public class ChewbaccaAndNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ans = 0;
		long cNumber = sc.nextLong();
		sc.close();
		long mul = 1;
		for (long i = cNumber; i > 0; i /= 10) {

			long rem = i % 10;

			long temp = 9 - rem;

			if (temp > rem) {
				ans += rem * mul;
			} else if (temp < rem) {
				ans += temp * mul;
			}

			mul *= 10;

		}

		System.out.println(ans);

	}

}
