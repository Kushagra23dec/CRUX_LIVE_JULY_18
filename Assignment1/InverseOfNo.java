package Assignment1;

import java.util.Scanner;

public class InverseOfNo {

	public static void main(String[] args) {
		int[] a = new int[9];
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = 1, j = 0;

		for (int i = n; i > 0; i /= 10) {

			a[i % 10] = p;
			p++;

		}
		j = p - 1;
		while (j > 0) {
			System.out.print(a[j]);
			j--;
		}

	}
}
