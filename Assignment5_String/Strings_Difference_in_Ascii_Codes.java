package Assignment5_String;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {

	public static void main(String args[]) {
		// Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		int n = str.length();
		String str2 = new String();

		for (int i = 0; i < n; i++) {
			str2 += str.charAt(i);

			if (i < n - 1) {
				int no = (int) str.charAt(i + 1) - (int) str2.charAt(str2.length() - 1);
				str2 += no;
			}

		}

		System.out.print(str2);

	}

}
