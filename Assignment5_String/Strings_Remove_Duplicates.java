package Assignment5_String;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String str2 = "";
		char c = ' ';
		int count = 0, p = 0;
		str2 += str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str2.charAt(p)) {

				str2 += str.charAt(i);

				p++;
			}

		}

		System.out.println(str2);

	}

}
