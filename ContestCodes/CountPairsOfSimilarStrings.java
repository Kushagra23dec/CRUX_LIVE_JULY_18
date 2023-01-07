package ContestCodes;

import java.util.*;

public class CountPairsOfSimilarStrings {

	public static void main(String[] args) {
//		 String[] words = { "aba", "aabb", "abcd", "bac", "aabc" };
//		String[] words = { "aabb", "ab", "ba", "bcd" };
//		String[] words = { "nba", "cba", "dba" };
		String[] words = { "dcedceadceceaeddcedc", "dddcebcedcdbaeaaaeab", "eecbeddbddeadcbbbdbb",
				"decbcbebbddceacdeadd", "ccbddbaedcadedbcaaae", "dddcaadaceaedcdceedd", "bbeddbcbbccddcaceeea",
				"bdabacbbdadabbbddaea" };

		System.out.println("\n"+sPairs(words));
	}

	public static int sPairs(String[] words) {
		int ans = 0;
		HashSet<Character> set = new HashSet<Character>();
		HashMap<String, Integer> map = new HashMap<>();

		for (String i : words) {
			if (set.isEmpty())
				for (char j : i.toCharArray()) {
					set.add(j);
				}

			String z = "";
			for (char x : set) {
				z += x;
			}
			if (!map.containsKey(z)) {

				map.put(z, 1);
			} else {
				int v = map.get(z);
				map.put(z, v + 1);
			}

			set.clear();

		}

		System.out.print(map);
		int tempSum = 0;
		for (int i : map.values()) {
			if (i != 1) {
				tempSum += i;
			}
		}
		if (tempSum > 4) {
			tempSum *= 2;
		} else if (tempSum % 2 == 0) {
			tempSum /= 2;
		}
		return tempSum;
	}

	
	
	
	
	
	
	
	public static int similarPairs(String[] words) {
		int ans = 0;

		Set<Character> set = new HashSet<>();
		HashMap<String, Integer> map = new HashMap<>();

		for (String s : words) {
			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
			String z = "";
			for (char i : set) {
				z += i;
			}
			set.clear();
			if (map.containsKey(z)) {
				map.put(z, map.get(z) + 1);
			} else {

				map.put(z, 1);
			}
		}

		System.out.println(map + " ");
		for (int i : map.values()) {

			if (i != 1) {
				if (i % 2 == 0) {
					ans += i - 1;
				} else {
					ans += i;
				}
			}

		}

		return ans;
	}

}
