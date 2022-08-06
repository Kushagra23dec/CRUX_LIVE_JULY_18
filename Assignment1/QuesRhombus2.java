package Assignment1;

import java.util.Scanner;

public class QuesRhombus2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int star = 1;
		int space = n - 1;
		int val = 1;
		while (row <= n * 2 - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;

			if (row <= n) {
				val = row;
				while (j <= star) {
					System.out.print(val + " ");

					if (j < row) {
						val++;
					} else {
						val--;
					}

					j++;
				}
			} else {
				j = 1;

				while (j <= star) {

					System.out.print(val + " ");

					if (j <= star / 2) {
						val++;
					} else {
						val--;
					}

					j++;
				}

			}

			if (row < n) {
				star += 2;
				space--;
			} else {
				star -= 2;
				space++;
			}

			row++;
			System.out.println();

		}

	}

}
