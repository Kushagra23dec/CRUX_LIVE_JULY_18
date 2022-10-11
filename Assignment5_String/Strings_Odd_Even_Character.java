package Assignment5_String;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(StringOddEvenChar(str));

	}

	public static String StringOddEvenChar(String str) {
		String ans = "";

		for (int i = 0; i < str.length(); i++) {

			if (i % 2 == 0) {
				ans += (char) (str.charAt(i) + 1);
			} else {
				ans += (char) (str.charAt(i) - 1);
			}

		}

		return ans;
	}

}
