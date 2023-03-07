package RecursionRevision2;

import java.util.Scanner;

public class StringPermutationNoDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		printPremutations(str, "");

	}

	public static void printPremutations(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		boolean[] visited = new boolean[26];

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			int idx = 0;
			if (ch - 65 >= 0 && ch - 65 <= 25) {
				idx = 65;
			} else {
				idx = 97;
			}

			if (!visited[ch - idx]) {
				visited[ch - idx] = true;
				printPremutations(ques.substring(0, i) + ques.substring(i + 1), ans + ch);
			}

		}

	}

}
