package Assignment1;

import java.util.Scanner;

public class NoOfDigit {
  
			public static void main(String[] args) {
				 Scanner s = new Scanner(System.in);
				 int n = s.nextInt();
				 int e = s.nextInt();
				 int c=0;
				 for(int i = n; i>0; i/=10) {
					 
					 if(e==i%10) {
						 c++;
					 }
					  
				 }
				 System.out.println(c);

			}


	

}
