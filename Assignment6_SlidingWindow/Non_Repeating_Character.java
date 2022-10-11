package Assignment6_SlidingWindow;

import java.util.Scanner;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // no of testcases

		while (t-- > 0) {

			String s = sc.next();

			char c = NonRepeatingChar(s);

			if (c == ' ') {
				System.out.println(-1);
			} else {
				System.out.println(c);
			}

		}

	}

//	3
//	codingblocks
//	abbac									si = 0,ei=0
//	java

	// Non repeating char function
	public static char NonRepeatingChar(String s) {
		char c = ' ';
		boolean f = false;
		int ei = 0, si = 0; // ending index and starting index
		char ans = ' ';
		while (ei < s.length()) {

			// grow
			c = s.charAt(si);

			// shrink
			int x = ei;
			int z = si - 1;
			while (x > si && ei >= si) {
				if (c == s.charAt(x)) {
					si++;
					c = s.charAt(si);
				}
				x--;

			}

			while (z >= 0 && ei >= si) {
				if (c == s.charAt(z)) {
					si++;
					c = s.charAt(si);
				}
				z--;
			}

			// calculate char
			// no need to calculate ans is c...

			ei++;
		}

		return c;
	}

}
