package Revision1;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int binary = sc.nextInt();
		sc.close();
		int decimal = 0;

		int mul = 1;

		for (int i = binary; i > 0; i /= 10) {

			int rem = i % 10;

			decimal += rem * mul;

			mul *= 2;

		}

		System.out.println(decimal);

	}

}
