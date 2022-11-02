package Revision1;

import java.util.Scanner;

public class PiyushAndMagicalPark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // row
		int m = sc.nextInt(); // column
		int k = sc.nextInt(); // minimum strength required.
		int s = sc.nextInt(); // strength

		char[][] grid = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = sc.next().charAt(0);
			}
		}
		
		sc.close();

		// . is obstacles // decrease by 2
		// * magical bean // increase by 5
		// # blockade // means jump to below row
		// strength of 1 for every step, his strength should always be greater than k
		// else he will loss
		// last of row to first of next row, he does not lost any strength.
		// atleast k strength is required for winning

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				char c = grid[i][j];
				if (s < k || s < 1) {
					System.out.println("No");
					return;
				}

				if (c == '#') {
					break;
				}

				if (c == '.') {
					if (j != m - 1) {
						s -= 1;
					}

					s -= 2;

				} else if (c == '*') {
					if (j != m - 1) {
						s -= 1;
					}

					s += 5;

				}

			}
		}

		System.out.println("Yes\n" + s);

	}

}
