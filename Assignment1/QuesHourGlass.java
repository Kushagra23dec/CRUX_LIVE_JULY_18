package Assignment1;

import java.util.Scanner;

public class QuesHourGlass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int row = 1;
		int star = n * 2 + 1;
		int val = n, kal = 1;
		int space = 0;
		int x = n + 1, k = 2;
		while (row <= n * 2 + 1) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}

			int j = 1;
			if (row <= n + 1) {
				while (j <= star) {
					System.out.print(val + " ");
					if (val > 0 && j <= n && x > j) {
						val--;

					} else if (j == star) {
						val--;
					} else {
						val++;
					}

					j++;
				}

			} else {
				while (j <= star) {
					System.out.print(kal + " ");

					if (kal > 0 && j < k) {
						kal--;
					} else if (j == star) {
						kal++;
					} else {
						kal++;
					}

					j++;
				}
			}

			if (row < n + 1) {
				star -= 2;
				space += 1;
				x--;

			} else {
				star += 2;
				space -= 1;
				k++;
			}

			row++;
			System.out.println();
		}

	}

}
