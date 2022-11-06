package Revision1;

import java.util.Scanner;

public class StringsToggleCase {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(StringToggleCase(str));

	}

	public static String StringToggleCase(String str) {
		String ans = "";

		for (int i = 0; i < str.length(); i++) {

			if ((int) str.charAt(i) % 91 >= 65 && (int) str.charAt(i) % 91 <= 90) {

				ans += (char) (str.charAt(i) + 32);

			} else if ((int) str.charAt(i) % 123 >= 97 && (int) str.charAt(i) % 123 <= 122) {

				ans += (char) (str.charAt(i) - 32);
			}

		}

		return ans;
	}
}
