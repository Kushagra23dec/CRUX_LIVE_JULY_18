package Lec2;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	int n = s.nextInt();
	int row = 1;
	int star = 1;
	int space = n+n-1;
	
	while(row<=n) {
		
		int j = 1;
		while(j<=star) {
			
			System.out.print("* ");
			
			
			
			j++;
			int i = 1;
			while(i<=space) {
			System.out.print("  ");
				i++;
		}
			
		}
		
		
		
		
	}
	
	
	
	
	}

}
