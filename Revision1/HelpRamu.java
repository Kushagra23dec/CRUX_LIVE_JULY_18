package Revision1;

import java.util.Scanner;

public class HelpRamu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = 0;

		testcase = sc.nextInt();

		while (testcase > 0) {
			int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
			c1 = sc.nextInt();
			c2 = sc.nextInt();
			c3 = sc.nextInt();
			c4 = sc.nextInt();
			int n = 0, m = 0;
			n = sc.nextInt();
			m = sc.nextInt();
			int[] nArray = new int[n];
			int[] mArray = new int[m];

			for (int i = 0; i < n; i++) {
				nArray[i] = sc.nextInt();
			}

			for (int i = 0; i < m; i++) {
				mArray[i] = sc.nextInt();
			}

			System.out.println(helpRamu(c1, c2, c3, c4, n, m, nArray, mArray));

			testcase--;
		}

	}

	public static int helpRamu(int c1, int c2, int c3, int c4, int n, int m, int[] nArray, int[] mArray) {
		int ans = 0;
		int minR = 0, minC = 0, TRick = 0, TCab = 0;
		for (int i = 0; i < n; i++) {
			minR += Math.min(nArray[i] * c1, c2);
		}
		TRick = Math.min(minR, c3);

		for (int i = 0; i < m; i++) {
			minC += Math.min(mArray[i] * c1, c2);
		}
		TCab = Math.min(minC, c3);

		ans = Math.min(TRick + TCab, c4);

		return ans;

	}
}