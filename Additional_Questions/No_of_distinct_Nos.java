package Additional_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class No_of_distinct_Nos {

	public static void main(String args[]) {

		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}

	public static boolean isPalindrome(String s) {

		String s1 = "", s2 = "";
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) < 65 || (s.charAt(i) > 90 && s.charAt(i) < 97) || s.charAt(i) > 122) {

			} else {
				s1 += s.charAt(i);
			}

			if (s.charAt(j) < 65 || (s.charAt(j) > 90 && s.charAt(j) < 97) || s.charAt(j) > 122) {

			} else {
				s2 += s.charAt(j);
			}
			j++;

		}

		if (s1.toLowerCase().equals(s2.toLowerCase())) {

			return true;
		}

		return false;
	}

}
