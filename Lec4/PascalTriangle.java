package Lec4;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 0;
		int no = 1;
		int space = n - 1;

		while (row < n) {

			int i = 1;

			no = 1;
			int j = 0;
			while (j <= row) {
				System.out.print(no + "\t");

				no = no * (row - j) / (j + 1);
				j++;
			}

			row++;
			space--;
			System.out.println();

		}

	}

}
