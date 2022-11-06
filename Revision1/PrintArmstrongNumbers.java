package Revision1;

import java.util.*;

public class PrintArmstrongNumbers {

	public static boolean isArmstrong(int n) {

		int x = n;
		int sum = 0, d = 0;
		while (x > 0) {
			d++;
			x /= 10;

		}
		x = n;

		while (x > 0) {
			int rem = x % 10;
			sum += Math.pow(rem, d);
			x /= 10;
		}

		if (sum == n) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// System.out.println(isArmstrong(n));

		int n2 = sc.nextInt();
		sc.close();
		int x = n;
		while (x >= n && x <= n2) {

			if (isArmstrong(x)) {
				System.out.println(x);
			}

			x++;
		}

	}
}