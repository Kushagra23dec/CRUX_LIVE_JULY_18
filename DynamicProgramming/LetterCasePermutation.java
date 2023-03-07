package DynamicProgramming;

import java.util.*;

public class LetterCasePermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		List<String> ans = letterCasePermutation(s);

		System.out.println(ans.toString());

	}

	public static List<String> letterCasePermutation(String s) {
		List<String> list = new ArrayList<>();
		letterCase(s, "", list);

		return list;
	}

	private static void letterCase(String ques, String ans, List<String> list) {
		if (ques.length() == 0) {
			list.add(ans);
			return;
		}

		// CHECK IF IT IS APHABET OR NOT
		if (Character.isAlphabetic(ques.charAt(0))) {
			letterCase(ques.substring(1), ans + ques.substring(0, 1).toLowerCase(), list);
			letterCase(ques.substring(1), ans + ques.substring(0, 1).toUpperCase(), list);

		} else {
			// if not alphabet
			letterCase(ques.substring(1), ans + ques.charAt(0), list);
			return;
		}

	}
}