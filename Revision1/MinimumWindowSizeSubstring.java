package Revision1;

import java.util.Scanner;

public class MinimumWindowSizeSubstring {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		System.out.println(FindMinimum(str1, str2));

	}

	private static String FindMinimum(String str1, String str2) {
		String ans = "";

		int[] freq1 = new int[256];
		int[] freq2 = new int[256];
		int count = 0;
		int start = 0, start_Index = -1, min_length = Integer.MAX_VALUE;

		for (int i = 0; i < str2.length(); i++) {
			freq2[str2.charAt(i)]++;
		}

		for (int ei = 0; ei < str1.length(); ei++) {
			char t = str1.charAt(ei);
			freq1[t]++;
			if (freq1[t] <= freq2[t]) {
				count++;
			}
			if (count == str2.length()) {
				while (freq1[str1.charAt(start)] > freq2[str1.charAt(start)] || freq2[str1.charAt(start)] == 0) {
					if (freq1[str1.charAt(start)] > freq2[str1.charAt(start)]) {
						freq1[str1.charAt(start)]--;
					}
					start++;
				}

				if (min_length > ei - start + 1) {
					min_length = ei - start + 1;
					start_Index = start;
				}
			}
		}

		if (start_Index == -1) {
			ans = "";
		} else {
			ans = str1.substring(start_Index, start_Index + min_length);
		}
		return ans;
	}

}
