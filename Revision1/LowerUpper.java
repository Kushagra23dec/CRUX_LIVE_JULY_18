package Revision1;

import java.util.*;

public class LowerUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();
		int p = c;
		if (p >= 65 && p <= 90) {
			System.out.println("UPPERCASE");
		} else if (p >= 97 && p <= 122) {
			System.out.println("lowercase");
		} else {
			System.out.println("Invalid");
		}

	}
}