package Lec14;

import java.util.Scanner;

public class ClockWise_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int c = 0;
		int t = m * n;
		int minR = 0, minC = 0, maxR = n - 1, maxC = m - 1;
		while (c < t) {

			for (int i = minR; i <= maxC && c < t; i++) {
				System.out.print(a[minR][i] + ", ");
				c++;
			}
			minR++;

			for (int i = minR; i <= maxR && c < t; i++) {
				System.out.print(a[i][maxC] + ", ");
				c++;

			}
			maxC--;

			for (int i = maxC; i >= minC && c < t; i--) {
				System.out.print(a[maxR][i] + ", ");
				c++;
			}
			maxR--;

			for (int i = maxR; i >= minR && c < t; i--) {
				System.out.print(a[i][minC] + ", ");
				c++;

			}
			minC++;

		}

		System.out.print("END");

	}

}
