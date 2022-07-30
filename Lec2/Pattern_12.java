package Lec2;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {

				System.out.print("* ");
				j++;
				if (j > 1 && j <= star) {
					System.out.print("! ");

				}

			}
			row++;
			star++;
			space -= 1;
			System.out.println();
		}
	}

}
