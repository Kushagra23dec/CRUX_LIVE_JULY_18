package Revision1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		sc.close();
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}

		System.out.print(divisor);

	}

}
