package Revision1;

import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int i = 1;
		while (n1 > 0) {

			int x = (3 * i) + 2;
			if (x % n2 != 0) {
				System.out.println(x);
				i++;
				n1--;
			} else {
				i++;
			}

		}

	}

}
