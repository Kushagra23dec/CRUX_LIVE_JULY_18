package RecursionRevision2;

import java.util.*;

public class Recursion_Subsequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int count = PrintSubsecquence(str, "");
		System.out.println("\n" + count);
	}

	public static int PrintSubsecquence(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);

		int a = PrintSubsecquence(ques.substring(1), ans);

		int b = PrintSubsecquence(ques.substring(1), ans + ch);

		return a + b;
	}

}
