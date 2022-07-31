package Lec2;

import java.util.Scanner;

public class Pattern_29 {

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
				if (j == 1 || j == star)
					System.out.print(row + " ");
				else
					System.out.print(0 + " ");
				j++;
			}

			row += 1;
			star += 2;
			space -= 1;
			System.out.println();
		}

	}

}
