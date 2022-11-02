package Revision1;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int decimal = sc.nextInt();

		sc.close();

		int octal = 0;

		int mul = 1;

		for (int i = decimal; i > 0; i /= 8) {

			int rem = i % 8;

			octal += rem * mul;

			mul *= 10;

		}

		System.out.println(octal);

	}

}
