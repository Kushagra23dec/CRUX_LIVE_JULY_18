package Revision1;

import java.util.*;

public class ShoppingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int m = sc.nextInt();
			int n = sc.nextInt();
			int i = 0, j = 0;

			while (i < m && j < n) {
				i = j + 1;

				if (i > m) {
					System.out.println("Harshit");
				}

				j = i + 1;

				if (j > n) {
					System.out.println("Aayush");
				}

			}

		}
		
		sc.close();
	}

}
