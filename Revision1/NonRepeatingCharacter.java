package Revision1;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			int[] freq = new int[256];

			char ch = firstNonRepeating(s, freq);

			if (ch == ' ') {
				System.out.println("-1");
			} else {
				System.out.println(ch);

			}
		}
		sc.close();

	}

	private static char firstNonRepeating(String s, int[] freq) {
		char ch = ' ';

		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (freq[s.charAt(i)] == 1) {
				ch = s.charAt(i);
				return ch;
			}
		}

		return ch;
	}

}
