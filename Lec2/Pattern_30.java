package Lec2;

import java.util.Scanner;

public class Pattern_30 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = n;
		int star = 1;

		while (row >= 1) {
			int i = n;
			while (i >= star) {
				System.out.print(i + " ");
				i--;
			}
			row--;
			System.out.println();
		}

	}

}
