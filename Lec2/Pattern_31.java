package Lec2;

import java.util.Scanner;

public class Pattern_31 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = 1;
		int star = 1;

		while (row <= n) {
			int i = n;
			while (i >= star) {
				if (i == row)
					System.out.print("* ");
				else
					System.out.print(i + " ");
				i--;
			}
			row++;
			System.out.println();
		}
	}

}
