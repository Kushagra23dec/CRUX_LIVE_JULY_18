package Recursion_Quesitons;

import java.util.*;

public class DictionaryOrderLarger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> li = new ArrayList<>();
		List<String> li2 = new ArrayList<>();
		boolean f = false;
		String se = s;
		dictionaryOrderLarger(s, "", li);

		li2 = li;

		Collections.sort(li2);

		for (String str : li2) {
			if (f == true)
				System.out.println(str + " ");
			if (str.equals(s)) {
				f = true;
			}

		}

	}

	public static void dictionaryOrderLarger(String ques, String ans, List<String> li) {

		if (ques.length() == 0) {
			// System.out.print(ans + " ");
			li.add(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			dictionaryOrderLarger(s1 + s2, ans + ques.charAt(i), li);
		}

	}

}
