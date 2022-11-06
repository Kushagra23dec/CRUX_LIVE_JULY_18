package Revision1;

import java.util.Scanner;

public class StringsIsPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		sc.close();
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println(false);
				return;
			}

			i++;
			j--;
		}

		System.out.println(true);

	}

}
