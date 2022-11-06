package Revision1;

import java.util.*;

public class LengthOfLongestSubstringWithoutRepeatingCharactersEasy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(MaxCWithoutRepeting(str));

	}

	// ABADEFGABEF

	// MaxCWithoutRepeting function returns length of max substring without
	// repetition ...
	public static int MaxCWithoutRepeting(String str) {

		int ei = 0, si = 0; // Ending index ans starting index both are initialized and 0 is assigned to
							// them.
		int max = 0; // Max variable will hold the initial max length of substring without
						// repetition....

		int ans = 0;
		while (ei < str.length()) {
			// grow

			// shrink
			int x = si; // x variable holds current starting index from where we have to start comparing
						// if there is any repetition or not
			while (ei > si && x < ei) {

				if (str.charAt(ei) == str.charAt(x)) { // if the added char to the substring is equal to the previous
														// substring then update the si to x...
					si = x + 1;
				}

				x++; // x increases by 1 till it reaches to ei-i ( which is the length of previous
						// substring)...

			}

			// calculate Max
			ans = ei - si + 1; // ans contains the size of current substring that is non repeating
			max = Math.max(ans, max); // max holds the max length of substring without repeating

			ei++; // increasing ending index with 1;
		}

		return max;
	}
}