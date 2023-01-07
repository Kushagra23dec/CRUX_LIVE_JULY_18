package Recursion_Revision1;

import java.util.*;

public class Mazepath_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int count = mazepathD(r, c, 1, 1, "");
		System.out.println("\n" + count);
	}

	private static int mazepathD(int r, int c, int vcount, int hcount, String ans) {
		// TODO Auto-generated method stub

		if (r == 1 && c == 1) {
			System.out.print(ans + " ");
			return 1;
		}

		int a = 0, b = 0, d = 0;

		// rows
		if (r > 1) {
			a += mazepathD(r - 1, c, vcount + 1, hcount, ans + "V");
		}
		// columns
		if (c > 1) {
			b += mazepathD(r, c - 1, vcount, hcount + 1, ans + "H");
		}
		// diagonals
		if (r > 1 && c > 1) {
			d += mazepathD(r - 1, c - 1, vcount + 1, hcount + 1, ans + "D");
		}

		return a + b + d;
	}

}
