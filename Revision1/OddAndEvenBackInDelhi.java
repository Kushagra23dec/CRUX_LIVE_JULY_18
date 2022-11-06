package Revision1;

import java.util.Scanner;

public class OddAndEvenBackInDelhi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int even = 0, odd = 0;
			for (int i = n; i > 0; i /= 10) {

				int rem = i % 10;

				if (rem % 2 == 0) {
					even += rem;
				}

				if (rem % 2 != 0) {
					odd += rem;
				}

			}

			if (even % 4 == 0) {
				System.out.println("Yes");
			} else if (odd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

		sc.close();

	}

}
