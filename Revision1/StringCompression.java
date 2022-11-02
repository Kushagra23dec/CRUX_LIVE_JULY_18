package Revision1;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int c = 1;
		String ans = "";

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				c++;
			} else {
				ans += s.charAt(i - 1) + "" + c;
				c = 1;

			}

			if (i == s.length() - 1) {

				ans += s.charAt(i) + "" + c;

			}

		}
		System.out.println(ans);

	}

}
