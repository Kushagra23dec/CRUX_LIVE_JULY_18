package Recursion_Quesitons;

import java.util.Scanner;

public class RecursionAsciiSubsequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int x = Asciisubsequence(s, "");
		System.out.println("\n" + x);
	}

	public static int Asciisubsequence(String s, String ans) {

		if (s.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		int a = 0, b = 0, c = 0;
		char ch = s.charAt(0);
		int Aval = ch;
		a = Asciisubsequence(s.substring(1), ans + "");

		b = Asciisubsequence(s.substring(1), ans + ch);

		c = Asciisubsequence(s.substring(1), ans + Aval);

		return a + b + c;

	}

}
