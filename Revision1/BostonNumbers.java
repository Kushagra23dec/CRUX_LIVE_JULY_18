package Revision1;

import java.util.Scanner;

public class BostonNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int left = 0, right = 0;
		left = DigitSum(n);

		System.out.println(left);

		for (int i = 2; i <= n;) {
			if (isPrime(i) && n % i == 0) {
				n /= i;
				right += DigitSum(i);
				System.out.println(i + " " + n);

			} else {
				i++;
			}
		}

		if (left == right) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static boolean isPrime(int n) {
		boolean ans = true;
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return ans;
	}

	public static int DigitSum(int n) {
		int ans = 0;
		for (int i = n; i > 0; i /= 10) {
			ans += i % 10;
		}
		return ans;
	}

}
