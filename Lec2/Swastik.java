package Lec2;

import java.util.*;

public class Swastik {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int star = 1;
		int row = 1;
		int space = n / 2 - 1;

		while (row <= n) {
			int i = 1;
			
//			if (row == 1 && i != 1)
//			while (i <= space) {
//				if (row == 1 && i != 1)
//					System.out.print(" ");
//				else if (row != n / 2 + 1)
//					System.out.print(" ");
//
//				i++;
//			}
			int j = 1;
			while (j <= star) {
				System.out.print("* ");
				j++;
			}

			star++;

			row++;
			System.out.println();
		}

	}
}
