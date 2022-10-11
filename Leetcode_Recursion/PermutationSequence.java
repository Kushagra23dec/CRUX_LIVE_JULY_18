package Leetcode_Recursion;

import java.util.*;

public class PermutationSequence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 List<String> li = new ArrayList<>();
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 String str = "";
		 for(int i = 1; i<=n; i++) {
			 str+=i;
		 }
		 
		 System.out.println(str);
		  PrintSubsequence(str,"",li);
	 

	}

	public static void PrintSubsequence(String str, String ans, List<String> li) {

		if (str.length() == 0) {
			li.add(ans);
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			String s1 = str.substring(0, i);
			String s2 = str.substring(i + 1);

			PrintSubsequence(s1 + s2, ans + str.charAt(i), li);

		}
		
	}

}
