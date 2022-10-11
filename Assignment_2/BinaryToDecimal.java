package Assignment_2;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0, rem = 0, mul = 1;

		while (n > 0) {
			rem = n % 10;
			sum += rem * mul;
			n /= 10;
			mul *= 2;
		}
		System.out.println(sum);
	}

}
