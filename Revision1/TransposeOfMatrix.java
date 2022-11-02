package Revision1;

import java.util.Scanner;

public class TransposeOfMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; i++) {
				int t = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = t;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; i++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
