package Lec4;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int star = 1;
		int space = n - 1;
		int val = 1;
		int nv = 0;
		while (row <= n * 2 - 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;

			if (row <= n)
				val = row;

			nv = val;

			while (j <= star) {
				System.out.print(val + " ");

				if (j < row && row <= n) {
					val++;
				} else if (row <= n) {
					val--;
				} else if (j < nv) {
					val++;
				} else {
					val--;
				}

				j++;
			}

			if (row <= n / 2 + 2) {
				star += 2;
				space -= 1;
			} else {
				star -= 2;
				space += 1;
			}

			row++;
			System.out.println();

		}

	}

}
