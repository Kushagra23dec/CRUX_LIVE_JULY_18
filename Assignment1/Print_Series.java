package Assignment1;

import java.util.Scanner;

public class Print_Series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N1 = s.nextInt();
		int N2 = s.nextInt();
		int i = 0;
		int k = 1;
		while (i < N1) {

			if ((3 * k + 2) % N2 != 0) {
				System.out.println((3 * k) + 2);
				i++;
			}

			k++;

		}

	}

}
