package Lec2;

import java.util.Scanner;

public class Lecture_10 {
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 int n = s.nextInt();
		 
		 int row = 1;
		 int star = 2*n-1;
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
			 star-=2;
			 row+=1;
			 space+=1;
			 System.out.println();
		 }
		}
}
