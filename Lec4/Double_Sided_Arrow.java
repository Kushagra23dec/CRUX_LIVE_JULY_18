package Lec4;
import java.util.*;
public class Double_Sided_Arrow {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 
		 int row = 1;
		 int star = 1;
		 int space = n-1;
		 int space2 = -1;
		 int vr = 1;
		 
		 while(row<=n) {
			 int i = 1;
			 while(i<=space) {
				 System.out.print("  ");
				 i++;
			 }
			 
			 int j = 1;
			 while(j<=star) {
				 System.out.print(vr+" ");
				 j++;
				 vr++;
			 }
			 
			 int x = 1;
			 while(x<=space2) {
				 
			 }
			 
			 
			 
			 
			 int k = vr;
			 if(row==1 && row==n)
			 while(k>=1) {
				 
				 System.out.print(vr+" ");
				 k--;
			 }
			 
			 if(row<n/2+1) {
				 star--;
				 space -=2;
				 space2 +=2;
			 }
			 else {
				 star--;
				 space +=2;
				 space2 -=2;
			 }
			 
			 row++;
			 System.out.println();
		 }

	}

}
