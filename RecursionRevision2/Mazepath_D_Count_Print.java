package RecursionRevision2;

import java.util.*;

public class Mazepath_D_Count_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int count = printPathD(n, m, 1, 1, "");

		System.out.println("\n" + count);
	}

	public static int printPathD(int row, int col, int cr, int cc, String ans) {

		if (cr > row || cc > col) {
			return 0;
		}

		if (cr == row && cc == col) {
			System.out.print(ans + " ");
			return 1;
		}

		int a = 0, b = 0, c = 0;

		// make the call for vertical
		if (cr < row) {
			a += printPathD(row, col, cr + 1, cc, ans + "V");
		}

		// make the call for horizontal
		if (cc < col) {
			b += printPathD(row, col, cr, cc + 1, ans + "H");
		}

		// make the call for diagonal.
		if (cr < row && cc < col) {
			c += printPathD(row, col, cr + 1, cc + 1, ans + "D");
		}

		return a + b + c;
	}

}
