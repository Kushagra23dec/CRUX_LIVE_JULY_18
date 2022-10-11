package Recursion_Quesitons;

import java.util.Scanner;

public class GenerateBinaryStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();

			GenerateBinary(s, "", 0);
			System.out.println();
		}

	}
	// 1??0?101

	public static void GenerateBinary(String s, String ans, int i) {
		if (i == s.length()) {
			System.out.print(ans + " ");
			return;
		}
		// Two recursive statements for 0 and 1
		if (s.charAt(i) == '?') {
			GenerateBinary(s, ans + '0', i + 1);
		}

		if (s.charAt(i) == '?') {
			GenerateBinary(s, ans + '1', i + 1);
		} else {
			GenerateBinary(s, ans + s.charAt(i), i + 1);
		}

	}

}
