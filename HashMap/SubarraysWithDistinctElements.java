package HashMap;

import java.util.*;

public class SubarraysWithDistinctElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int res = 0;

		for (int i = 0; i < arr.length; i++) {

			Set<Integer> distinctSet = new HashSet<>();

			for (int j = i; j < arr.length; j++) {

				if (distinctSet.contains(arr[j])) {
					distinctSet.remove(arr[j]);
					break;
				} else {

					distinctSet.add(arr[j]);
					res += distinctSet.size();

				}

			}

		}

		System.out.println(res);
	}
}
