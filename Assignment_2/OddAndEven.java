package Assignment_2;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0 ;
		while (n > 0) {
		
			x = sc.nextInt();
			
			int oddSum = 0, evenSum = 0;
			while (x > 0) {
				int rem = x % 10;

				if (rem % 2 == 0) {
					evenSum += rem;
				} else {
					oddSum += rem;
				}

				x /= 10;

			}
			if (oddSum % 3 == 0) {
				System.out.println("Yes");
			} else if (evenSum % 4 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

			n--;

		}

	}

}
