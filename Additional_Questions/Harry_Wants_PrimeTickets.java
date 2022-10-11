package Additional_Questions;

import java.util.Scanner;

public class Harry_Wants_PrimeTickets {

	public static int PrimeChecker(int n) {

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return -1;
			}

		}

		return n;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = 0;
		int i = 2;
		while (c < 20) {

			if (PrimeChecker(i) != -1) {
				System.out.print(" " + i);
				c++;
			}

			i++;

		}

	}

}
