package Revision1;

import java.util.Scanner;

public class ReplaceAllZerosWithFive {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		sc.close();
		int mul = 1;
		int ans = 0;
		if(n==0) {
			System.out.println(5);
			return;
		}
		for(int i = n; i>0; i/=10) {
			
			int rem = i % 10;
			if(rem == 0) {
				rem = 5;
			}
			
			ans = ans + rem * mul;
			mul *= 10;
			
		}
		
		System.out.println(ans);
		
		
		
		
	}

}
