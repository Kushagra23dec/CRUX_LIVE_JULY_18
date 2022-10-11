package Lec14;

import java.util.Scanner;

public class AntiClockWise_Matrix {
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
		int minR = 0, minC = 0, maxR = a.length - 1, maxC = a[0].length - 1;
		while (c < t) {

			// left
			for (int i = minR; i <= maxR && c < t; i++) {
				System.out.print(a[i][minC] + ", ");
				c++;
			}
			minC++;

			// bottom
			for (int i = minC; i <= maxC && c < t; i++) {
				System.out.print(a[maxR][i] + ", ");
				c++;
			}
			maxR--;

			// right
			for (int i = maxR; i >= minR && c < t; i--) {
				System.out.print(a[i][maxC] + ", ");
				c++;
			}
			maxC--;

			// top
			for (int i = maxC; i >= minC && c < t; i--) {
				System.out.print(a[minR][i] + ", ");
				c++;
			}
			minR++;

		}

		System.out.print("END");

	}
}
