package Lec2;
import java.util.Scanner;
public class Pattern_19 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 int n = s.nextInt();
		 int space = -1;
		 int row = 1;
		 int star = n/2+1;
		 
		 while(row<=n) {
			 int i = 1;
			 while(i<=star) {
				 System.out.print("* ");
				 i++;
			 }
//			 space
			 int j =1 ;
			 while(j<=space) {
				 System.out.print("  ");
				 j++;
			 }
			 // star
			 int k = 1;
			 while(k<=star) {
				 if(k!=n/2+1)
				 System.out.print("* ");
				 k++;
			 }
			 
			 if(row<n/2+1) {
				 star--;
				 space+=2;
			 }
			 else {
				 star++;
				 space-=2;
			 }
			 row++;
			 System.out.println();
			 
		 }

	}

}
