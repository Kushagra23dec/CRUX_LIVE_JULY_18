package Assignment1;

import java.util.Scanner;

public class QuesRhombus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int star = n;
		int space = n - 1;

		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				if (row == 1 || row == n || j == 1 || j == n)
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
			}

			space--;

			row++;

			System.out.println();

		}

	}

}
