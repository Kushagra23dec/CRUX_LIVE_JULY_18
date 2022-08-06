package Lec4;

import java.util.*;

public class Fibonaaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int nos = 1;
		int row = 1;
		int fibo = 1;
		int a = 0, b = 1, c = 0;
		while (row <= n) {

			int i = 1;
			while (i <= nos) {

				System.out.print(a + " ");
				i++;
				c = a + b;
				b = a;
				a = c;

			}

			row++;
			nos++;
			System.out.println();

		}
	}
}
