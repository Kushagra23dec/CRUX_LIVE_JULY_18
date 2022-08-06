package Assignment1;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int divisor = s.nextInt();
		int divident = s.nextInt();
		int lcm = 0;
		int a = divisor, b = divident;
		while (divident % divisor != 0) {

			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}

		lcm = (a * b) / divisor;
		System.out.print(lcm);

	}
}
