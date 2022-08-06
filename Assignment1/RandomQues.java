package Assignment1;

import java.util.Scanner;

public class RandomQues {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int row = 1;
		int star = N;
		int space = -1;
		while (row <= N * 2 - 1) // loop for row
		{
			int i = 1;
			while (i <= star) // loop for first half star
			{
				System.out.print("*");
				i++;
			}
			int j = 1;
			while (j <= space) // loop for mid space
			{
				System.out.print(" ");
				j++;
			}
			int k = 1;
			if (row == 1 || row == 2 * N - 1) {
				k = 2;
			}
			while (k <= star) // loop for second half star
			{
				System.out.print("*");
				k++;
			}
//mirroring
			if (row < N) {
				star--;
				space = space + 2;
			} else {
				star++;
				space = space - 2;
			}
//next row prep
			System.out.println();
			row++;
		}
	}
}
