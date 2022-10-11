package Lec27;

import java.util.*;

public class SudokuSolver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] board = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
				{ "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
				{ "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
				{ "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
				{ ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };

		int n = sc.nextInt();
		List<List<Integer>> li = new ArrayList<>();
		List<Integer> lii = new ArrayList<>();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int size = 1;
		for (int i = 2; i <= a.length; i++) {
			size *= i;
		}

		System.out.println("\n" + size);

		for (int i = 1; i < size; i++) {

			nextPermutation(a, li, lii);
		}

		System.out.println(li);

	}

	public static void nextPermutation(int[] a, List<List<Integer>> li, List<Integer> lii) {
		int p = 0; // index of first no from right to left traversal that is smaller than its
					// successor

		int q = 0; // index o first no from right to left traversal that is larger than a[p]

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] < a[i + 1]) {
				p = i;
				break;
			}
		}

		for (int i = a.length - 1; i > p; i--) {
			if (a[i] > a[p]) {
				q = i;
				break;
			}
		}

		if (p == 0 && q == 0) {
			reverse(a, 0, a.length - 1);
			// System.out.print(Arrays.toString(a));
			return;
		}

		int t = a[p];
		a[p] = a[q];
		a[q] = t;

		reverse(a, p + 1, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			lii.add(a[i]);
		}
		li.add(new ArrayList<>(lii));

		lii.clear();
		// System.out.print(Arrays.toString(a));

	}

	public static void reverse(int[] a, int i, int j) {
		while (i < j) {
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
			i++;
			j--;
		}
	}

}
