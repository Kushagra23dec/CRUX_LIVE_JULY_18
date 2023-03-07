package RecursionRevision2;

import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {

	public static String[] alphabets = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		List<String> ans = new ArrayList<>();

		generateKeyPadCodes(n, "", ans);

		for (String i : ans) {
			System.out.print(i + " ");
		}

	}

	public static void generateKeyPadCodes(String digits, String ans, List<String> list) {

		if (digits.length() == 0) {
			list.add(ans);
			return;
		}

		int idx = digits.charAt(0) - '0';

		String s1 = alphabets[idx];

		for (int i = 0; i < s1.length(); i++) {
			generateKeyPadCodes(digits.substring(1), ans + s1.charAt(i), list);
		}

	}

}
