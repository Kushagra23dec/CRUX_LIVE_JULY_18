package Lec2;

import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = 1;
		int star = 1;
		int space = n-1;
		int v = 1;
		while(row<=n*2-1) {
			int i = 1;
			v = row;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j<=star) {
				System.out.print(v+" ");
				j++;
				v++;
			}
			int x=v-2;
			while(x>=row & x!=1) {
				System.out.print(x+" ");
				x--;
			}
			 if(row<=n-1) {
				 star++;
				 space--;
			 }
			 else {
				 star--;
				 space++;
			 }
			 
			row++;
			 
			System.out.println();
		}
		
	}

}
