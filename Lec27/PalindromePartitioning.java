package Lec27;

import java.util.*;

public class PalindromePartitioning {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<>();
		List<List<String>> lli = new ArrayList<>();
		String s = sc.next();

		Partition(s, li, lli);
		System.out.println(lli);

	}

	public static void Partition(String ques, List<String> li, List<List<String>> lli) {

		if (ques.length() == 0) {
			// System.out.println(ans);
			lli.add(new ArrayList<>(li));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (Palindrome(s) == true) {
				li.add(s);
				Partition(ques.substring(i), li, lli);
				li.remove(li.size() - 1);
			}
		}

	}

	public static boolean Palindrome(String s) {

		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

}
