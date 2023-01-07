package Recursion_Revision1;

import java.util.*;

public class Subset_problem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];

		List<List<Integer>> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int t = sc.nextInt();
		boolean[] visited = new boolean[n];

		int count = subsetSum(a, t, visited, ans, new ArrayList<>());

		for (int i = 0; i < ans.size(); i++) {
			for (int j : ans.get(i)) {
				System.out.print(j + " ");
			}
			if (i != ans.size() - 1)
				System.out.print(" ");
		}

		System.out.println("\n" + count);

	}

	private static int subsetSum(int[] a, int t, boolean[] vis, List<List<Integer>> ans, List<Integer> ll) {
		if (t == 0) {
			Collections.sort(ll);

			if (ans.contains(ll)) {
				return 0;
			}

			ans.add(new ArrayList<>(ll));
			return 1;
		}

		if (t < 0)
			return 0;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (!vis[i]) {
				vis[i] = true;
				ll.add(a[i]);
				count += subsetSum(a, t - a[i], vis, ans, ll);
				ll.remove(ll.size() - 1);
				vis[i] = false;
			}

		}

		return count;
	}

}
