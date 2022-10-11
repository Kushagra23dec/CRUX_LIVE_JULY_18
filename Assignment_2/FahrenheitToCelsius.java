package Assignment_2;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int steps = sc.nextInt();
		int c = 0, f = min;
		while (f <= max) {
			System.out.print(f);
			c = (int) ((5.0 / 9.0) * (f - 32.0));
			System.out.println("\t" + c);
			f += steps;

		}

	}

}
