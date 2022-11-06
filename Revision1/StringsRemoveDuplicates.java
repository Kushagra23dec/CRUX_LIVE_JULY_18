package Revision1;

import java.util.*;

public class StringsRemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		sc.close();
		String st = str.charAt(0) + "";
		int k = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != st.charAt(k)) {
				st += str.charAt(i);
				k++;
			}

		}

		System.out.println(st);
	}

}
