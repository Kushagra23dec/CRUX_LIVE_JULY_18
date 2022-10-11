package Assignment5_String;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(CompressedString(str));

	}

	public static String CompressedString(String str) {
		String ans = "";

		int cCount = 0;
		char currentChar = ' ';

		for (int i = 0; i < str.length(); i++) {

			if (i == 0) {

				currentChar = str.charAt(0);
				cCount++;

			} else if (str.charAt(i) == currentChar) {
				currentChar = str.charAt(i);
				cCount++;
			} else {
				ans += currentChar;
				ans += cCount++;
				currentChar = str.charAt(i);
				cCount = 1;
			}

		}
		ans += currentChar;
		ans += cCount++;

		return ans;
	}

}
