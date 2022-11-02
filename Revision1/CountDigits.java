package Revision1;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = sc.nextInt();

		sc.close();

		int c = 0;
		int d = n;

		for (int i = d; i > 0; i /= 10) {
			int rem = i % 10;
			if (rem == count) {
				c++;
			}
		}

		System.out.println(c);

	}

}
