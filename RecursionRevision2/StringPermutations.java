package RecursionRevision2;

import java.util.*;

public class StringPermutations {

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

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);

			printPremutations(ques.substring(0, i) + ques.substring(i + 1), ans + ch);

		}

	}

}
