package Lec7;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int mul = 1, sum = 0, rem = 0;

		while (n > 0) {
			rem = n % 8;
			sum += rem * mul;
			n /= 8;
			mul *= 10;
		}

		System.out.println(sum);

	}

}
