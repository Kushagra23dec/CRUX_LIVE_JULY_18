package Lec2;

import java.util.*;

public class Ques {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int star = n;
		int space = -1;

		while (row <= n * 2 - 1) {
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}

			int k = 1;

			while (k <= star) {
				if (k == 1 && row == 1 || row == 2 * n - 1 && k == 1) {

				} else
					System.out.print("*");

				k++;
			}

			if (row < n) {

				star--;
				space += 2;
			}

			else {
				star++;
				space -= 2;
			}

			row++;
			System.out.println();
		}

	}
}
