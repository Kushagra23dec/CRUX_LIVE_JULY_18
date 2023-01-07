package Recursion_Revision1;

import java.util.*;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ans = generateParenthesis(3);
		
		System.out.println(ans+"\n"+"count:"+ans.size());
	}

	public static List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		generateParen(n, 0, 0, ans, "");
		return ans;
	}

	public static void generateParen(int n, int openCount, int closeCount, List<String> ll, String ans) {
		if (openCount == n && closeCount == n) {
			ll.add(ans);
			return;
		}

		if (openCount < n) {
			generateParen(n, openCount + 1, closeCount, ll, ans + "(");
		}

		if (closeCount < openCount) {
			generateParen(n, openCount, closeCount + 1, ll, ans + ")");
		}

	}

}
