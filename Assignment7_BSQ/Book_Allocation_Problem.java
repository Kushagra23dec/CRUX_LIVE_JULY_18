package Assignment7_BSQ;

import java.util.*;

public class Book_Allocation_Problem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int nobooks = sc.nextInt();
			int nostudents = sc.nextInt();
			int[] nopages = new int[nobooks];

			for (int i = 0; i < nobooks; i++) {
				nopages[i] = sc.nextInt();
			}

			System.out.println(bookAllocation(nostudents, nopages));

		}

	}

	public static int bookAllocation(int nostudents, int[] nopages) {
		int ans = 0;
		int lo = 0;
		int hi = 0;

		for (int x : nopages) {
			hi += x;
		}

		while (lo <= hi) {
			int mid = (lo + hi) / 2;

			if (isPossible(nostudents, nopages, mid)) {

				hi = mid - 1;

				ans = mid;
			} else {

				lo = mid + 1;
			}
		}

		return ans;
	}

	public static boolean isPossible(int nostudents, int[] nopages, int mid) {

		int nos = 1;
		int tpages = 0;
		int i = 0;

		while (i < nopages.length) {

			if (tpages + nopages[i] <= mid) {

				tpages += nopages[i];
				i++;
			} else {
				nos++;
				tpages = 0;

			}

			if (nos > nostudents) {
				return false;
			}

		}

		return true;
	}

}
