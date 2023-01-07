package Recursion_Revision1;

import java.util.*;

public class BoardPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dice = sc.nextInt();
		int n = sc.nextInt();
		
		int count = boardpath(dice,n,"");
		
		System.out.println("\n"+"Count:"+count);
	}
	
	
	// Recursion 
	public static int boardpath(int dice,int n,String ans) {
		
		if(n==0) {
			System.out.print(ans+" ");
			return 1;
		}

		if(n<0) return 0;
			
		int x = 0;
		 for(int i = 1; i<=dice; i++) {
			 	 x += boardpath(dice,n-i,ans+i);
		 }
		 
		 return x;
		
		
	}
	

}
