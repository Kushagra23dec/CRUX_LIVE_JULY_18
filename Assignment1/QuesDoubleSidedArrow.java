package Assignment1;

import java.util.Scanner;

public class QuesDoubleSidedArrow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int space = n - 1, space2 = -1;
		int star = 1, val = 1;
		int k = 2;

		while (row <= n) {

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;

			if (row <= n / 2 + 1) {
				val = row;
			} else {
				val = row - k;
				k += 2;
			}

			while (j <= star) {
				System.out.print(val + " ");

				val--;

				j++;
			}

			i = 1;
			while (i <= space2) {
				System.out.print("  ");

				i++;
			}

			j = val;
			val += 1;
			if (row != 1 && row != n)
				while (j < star) {
					System.out.print(val + " ");

					val++;

					j++;
				}

			if (row <= n / 2) {
				star += 1;
				space -= 2;
				space2 += 2;

			} else {
				star -= 1;
				space += 2;
				space2 -= 2;

			}

			row++;
			System.out.println();

		}

	}

}
