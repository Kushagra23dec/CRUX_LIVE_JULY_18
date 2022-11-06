package Revision1;

import java.util.*;

public class StringsMaxFrequencyCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();

		char max = returnMaxCount(str);

		System.out.println(max);
	}

	private static char returnMaxCount(String str) {
		char ans = ' ';
		int[] freq = new int[126];
		int x = 0;
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
			x = Math.max(freq[str.charAt(i)], x);
		}

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == x) {
				ans = str.charAt(i);
				return ans;
			}
		}

		return ans;
	}

}
