package Lec8;

import java.util.Scanner;

public class Armstrong {

	public static boolean armstrong(int n) {
		boolean f = false;
		int x = n, c = countDigit(n), sum = 0;

		while (x > 0) {
			int rem = x % 10;
			sum += (int) Math.pow(rem, c);
			x /= 10;
		}

		if (sum == n) {
			f = true;
		}

		return f;
	}

	public static int countDigit(int n) {
		int x = 0;
		while (n > 0) {
			n /= 10;
			x++;
		}
		return x;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(armstrong(n));

	}

}
