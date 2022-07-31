package Lec2;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int row = 1;
		int star = 1;
		int space = n + n - 3;

		while (row <= n) {

			 int j = 1;
			 while(j<=star){
				  
	 		 if(j!=n)
	  				System.out.print("* ");

//					 System.out.println("*");
//				 else
					 	 
				 j++;
			 }
			 
			 int i = 1;
			 while(i<=space) {
				 System.out.print("  ");
				 i++;
			 }

			 int x = 1;
			 while(x<=star) {
				 System.out.print("* ");
				 x++;
			 }
			 
			 
			 row++;
			 star+=1;
			 space-=2;
			 System.out.println();

		}

	}

}
