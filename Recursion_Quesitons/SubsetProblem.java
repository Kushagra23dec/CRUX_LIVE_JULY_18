package Recursion_Quesitons;

import java.util.*;

public class SubsetProblem {

	static int v = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<>();
		List<String> li2 = new ArrayList<>();
		int n = sc.nextInt();
		int[] a = new int[n];

		int t = 0;

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i : a) {
			t += i;
		}

		t /= 2;

		FindSubset(a, "", t, 0, li);
		li2 = li;
		Collections.reverse(li2);
		int si = li.size() - 1;
		for (int i = 0; i <= si; i++) {
			System.out.println(li2.get(si - i) + "and " + li.get(i));
		}

		System.out.print("\n" + v);

	}

	public static void FindSubset(int[] a, String ans, int t, int sum, List<String> li) {

		if (a.length == 0) {
			if (t == sum) {
				li.add(ans);
				v++;
			}
			return;
		}

		int in = a[0];

		FindSubset(Arrays.copyOfRange(a, 1, a.length), ans + in + " ", t, sum + in, li);
		FindSubset(Arrays.copyOfRange(a, 1, a.length), ans + "", t, sum, li);

	}

}
