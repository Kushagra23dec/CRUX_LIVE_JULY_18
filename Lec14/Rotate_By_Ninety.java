package Lec14;

import java.util.Scanner;

public class Rotate_By_Ninety {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		// Transposing the matrix
		for (int row = 0; row < n; row++) {

			for (int col = 1 + row; col < n; col++) {

				int t = matrix[row][col];
				matrix[row][col] = matrix[col][row];
				matrix[col][row] = t;
			}

		}

		// swapping rows
		int c = 0, t = (n * n) / 2, row = 0, rown = n - 1;

		while (c < t && (rown>row)) {

			for (int i = 0; i < n && (rown>row); i++) {
				int temp = matrix[row][i];
				matrix[row][i] = matrix[rown][i];
				matrix[rown][i] = temp;

				c++;
			}

			rown--;
			row++;

		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
