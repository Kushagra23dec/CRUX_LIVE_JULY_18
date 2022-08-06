package Assignment1;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int c=1, e=0, o=0;

		 for(int i = n; i>0 ;i/=10) {
			 
			 if(c%2==0) {
				 o+=i%10;
				 c++;
			 }else {
				 e+=i%10;
				 c++;
			 }
		 }
		 System.out.println(e);
		 System.out.println(o);

	}

}
