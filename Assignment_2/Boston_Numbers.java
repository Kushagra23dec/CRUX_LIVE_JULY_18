package Assignment_2;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum1 = 0, sum2 = 0, i = 2, x = n, p = 1;

		while (x > 0) {
			sum1 += x % 10;
			x /= 10;
		}

		while (n > 1) {

			if (n % i == 0) {
				n /= i;
				if (i < 9) {
					sum2 += i;

				} else {
					p = i;
					while (i > 0) {
						sum2 += i % 10;
						i /= 10;
					}

					i = p;
				}

			}

			else {
				i++;

			}

		}

		if (sum1 == sum2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
