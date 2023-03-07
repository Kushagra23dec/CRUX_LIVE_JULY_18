package HashMap;

import java.util.*;

public class Meow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String str = sc.next();
			boolean ans = Meow(str.substring(0,n));
			System.out.println(ans ? "YES" : "NO");
		}

	}

	public static boolean Meow(String str) {

		int count = 0;
		boolean m = false, e = false, o = false, w = false;

		for (char c : str.toCharArray()) {

			if (c == 'm' || c == 'M') {
				if (e || o || w) {
					return false;
				}

				if (count == 1 || count == 0) {
					count = 1;
					m = true;
				} else {
					return false;
				}

			} else if (c == 'e' || c == 'E') {

				if (m == false || o || w) {
					return false;
				}

				if (count == 2 || count == 1) {
					count = 2;
					e = true;
				} else {
					return false;
				}
			}

			else if (c == 'o' || c == 'O') {

				if (e == false || m == false || w) {
					return false;
				}

				if (count == 3 || count == 2) {
					count = 3;
					o = true;
				} else {
					return false;
				}
			}

			else if (c == 'w' || c == 'W') {

				if (m == false || e == false || o == false) {
					return false;
				}

				if (count == 4 || count == 3) {
					count = 4;
					w = true;
				} else {
					return false;
				}
			} else {
				return false;
			}

		}

		return (count==4)?true:false;

	}

}
