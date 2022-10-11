package Assignment5_String;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String str = sc.next();
		 
		 
		 System.out.println(NoOfPalindromeSubString(str));

	}

	// No of palindrome sub string 
	
	public static int NoOfPalindromeSubString(String str) {
		int ans = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			for(int j = i+1; j<=str.length(); j++) {
				
				String sub = str.substring(i,j);
				
				if(isPalindrome(sub)) {
					ans++;
				}
			}
		}
		
		
		return ans;
	}
	
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			
			i++;
			j--;

		}

		return true;
	}
	
	
	
}
