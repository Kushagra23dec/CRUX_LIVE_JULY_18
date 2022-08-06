package Assignment1;

import java.util.Scanner;

public class QuesInvertedHourGlass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int row = 1;
		int space = n * 2 - 1;
		int star = 1;
		int val = n, kal = 1;

		while (row <= n * 2 + 1) {

			val = n;
			int j = 1;
			while (j <= star) {
				System.out.print(val + " ");

				val--;

				j++;
			}

			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int x = 1;
			if (star == n + 1) {
				x = 2;
			}
			kal = val + 1;
			if(kal==0) {
				kal=1;
			}
			while (x <= star) {

				System.out.print(kal + " ");

				kal++;

				x++;
			}

			if (row < n + 1) {
				star += 1;
				space -= 2;
			} else {
				star -= 1;
				space += 2;
			}

			row++;
			System.out.println();
		}

	}

}
