package Revision1;

import java.util.*;

public class FindingCBNumber {

	public static void main(String[] args) {

		int[] cb = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int c = 0;
		if (s.equals(" ")) {
			System.out.println(0);
		}

		boolean[] b = new boolean[n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - 1; j >= i; j--) {
				if (b[j] == false) {
					long x = Long.parseLong(s.substring(i, j + 1));

					if (isCBno(x)) {
						// System.out.println(x + " , ");
						b[j] = true;
						c++;
					}
				}

			}

		}

		System.out.println(c);

	}

	public static boolean isCBno(long n) {

		int[] cb = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}

		if (n < 30)
			for (int i : cb) {
				if (n == i) {
					return true;
				}
			}

		for (int i : cb) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
