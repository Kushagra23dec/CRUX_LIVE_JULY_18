package Revision1;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = 0;
		for (int i = n; i > 0; i /= 10) {
			digit++;
		}
		int sum = 0;
		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;

			sum += (int) Math.pow(rem, digit);
		}

		System.out.println(sum == n);
		
		sc.close();
	}

}
