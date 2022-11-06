package Revision1;

import java.util.Scanner;

public class KartikBhaiyaAndStrings {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();

		int a = flipChar(str, k, 'a');
		int b = flipChar(str, k, 'b');
		System.out.print(Math.max(a, b));
	}

// logic 
	public static int flipChar(String str, int k, char ch) {

		int si = 0, ei = 0, flip = 0;
		int ans = 0;
		while (ei < str.length()) {
			// grow
			if (str.charAt(ei) != ch) {
				flip++;
			}
			// shrink
			while (flip > k && si <= ei) {
				if (str.charAt(si) != ch) {
					flip--;
				}
				si++;
			}

			// ans calculate
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}

}