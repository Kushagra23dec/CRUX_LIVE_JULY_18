package Assignment5_String;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(MaxFrequency(str));

	}

	public static char MaxFrequency(String str) {
		char ans = ' ';
		int idx = 0;
		int[] a = new int[26]; // index act as no of repetition

		for (int i = 0; i < str.length(); i++) {
			idx = (int) str.charAt(i) % 123;
			idx -= 97;
			a[idx] += 1;

		}

		int max = 0;
		for (int i = 1; i < 26; i++) {
			if (a[i] > a[max]) {
				max = i;
			}

		}

		ans = (char) (max + 97);

		return ans;
	}

}
