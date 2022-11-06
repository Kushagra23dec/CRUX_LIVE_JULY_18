package Revision1;

import java.util.Scanner;

public class PlayingWithGoodStrings {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(GoodStringL(s));

	}

	public static int GoodStringL(String s) {
		int ans = 0;

		int ei = 0, si = 0;

		while (ei < s.length()) {
			// grow

			// shrink
			while (Check(s.charAt(ei)) && si <= ei) {
				si++;

			}
			// calculate ans
			ans = Math.max(ans, ei - si + 1);

			ei++;

		}

		return ans;
	}

	public static boolean Check(char c) {
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };

		for (char che : ch) {
			if (che == c) {
				return false;
			}
		}

		return true;
	}

}
