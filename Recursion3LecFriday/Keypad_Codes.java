package Recursion3LecFriday;

import java.util.Scanner;

public class Keypad_Codes {

	public static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	public static int val = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		keypadCodes(s, "");
		System.out.print("\n" + val);

	}

	public static void keypadCodes(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			val++;
			return;
		}

		String s = key[ques.charAt(0) - '0'];

		for (int i = 0; i < s.length(); i++) {

			keypadCodes(ques.substring(1), ans + s.charAt(i));
		}

	}

}
