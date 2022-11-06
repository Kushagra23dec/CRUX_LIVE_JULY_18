package Revision1;

import java.util.Scanner;

public class ConversionFahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int steps = sc.nextInt();
		sc.close();
		int c = 0, f = min;
		while (f <= max) {
			System.out.print(f);
			c = (int) ((5.0f / 9.0f) * (f - 32.0f));
			System.out.println("\t" + c);
			f += steps;

		}

	}
}
