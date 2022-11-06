package Revision1;

import java.util.*;

public class FormMinimumNumberFromGivenSequence {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] st = new String[n];
		for (int i = 0; i < n; i++) {
			st[i] = sc.next();
		}
		sc.close();

		for (String s : st)
			PrintPattern(s);

	}

	private static void PrintPattern(String s) {
		int x = 1;
		int[] val = new int[s.length() + 1];

		for (int i = 0; i <= s.length(); i++) {
			if (i == s.length() || s.charAt(i) == 'I') {
				val[i] = x++;

				for (int j = i - 1; j >= 0 && s.charAt(j) == 'D'; j--) {
					val[j] = x++;
				}
			}

		}

		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i]);
		}
		System.out.println();

	}

}
