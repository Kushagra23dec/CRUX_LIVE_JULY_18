package Recursion_Quesitons;

import java.util.*;

public class RecursionCodes {

	static char[] keys = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> li = new ArrayList<String>();

		recursionCodes(n, "", 0, li);
		Collections.sort(li);

		System.out.print(li);

	}

	public static void recursionCodes(int n, String ans, int i, List<String> li) {

		if (n == 0) {
			// System.out.print(ans+" ");
			if (li.contains(ans) == false)
				li.add(ans);
			return;
		}
		if (n % 10 < 27)
			recursionCodes(n / 10, keys[n % 10] + ans, n % 10, li);

		if (n % 100 < 27) {
			recursionCodes(n / 100, keys[n % 100] + ans, n % 100, li);
		}

	}

}
