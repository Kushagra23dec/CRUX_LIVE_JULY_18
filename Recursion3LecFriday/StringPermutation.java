package Recursion3LecFriday;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String ques = sc.next();
		 Permutation(ques,"");
	}
	
	public static void Permutation(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		
		for(int i = 0; i<ques.length(); i++) {
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Permutation(s1+s2,ans+ques.charAt(i));
		}
	}

}
