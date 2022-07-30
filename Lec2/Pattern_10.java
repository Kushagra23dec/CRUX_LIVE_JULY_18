package Lec2;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int row = 1;
		int star = n+n-1;
		int space = 0;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			row++;
			star-=2;
			space+=1;
			System.out.println();
		}
		
		
	}

}
