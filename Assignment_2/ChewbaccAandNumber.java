package Assignment_2;

import java.util.Scanner;

public class ChewbaccAandNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long cno = 0, mul = 1;
		while (x > 0) {

			long rem = x % 10;

			long temp = 9 - rem;

			x /= 10;

			if (temp < rem && (x <= 0 && temp == 0)) {
				cno += rem * mul;
			} else if (temp < rem) {
				cno += (9 - rem) * mul;

			} else {

				cno += rem * mul;
			}

			mul *= 10;

		}
		System.out.println(cno);

	}

}
