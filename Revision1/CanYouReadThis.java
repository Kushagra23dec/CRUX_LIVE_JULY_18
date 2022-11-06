package Revision1;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		WordsPrinter(str);

	}

	public static void WordsPrinter(String str) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) <= 90) {

				if (c == 1) {
					System.out.println();
					c = 0;
				}
				c = 1;

			}

			System.out.print(str.charAt(i));

		}

	}
}