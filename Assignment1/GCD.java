package Assignment1;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int divisor = s.nextInt();
		 int divident = s.nextInt();
		 
		 while(divident%divisor!=0) {
			 
			 int rem = divident%divisor;
			 divident = divisor;
			 divisor = rem;
		 }
		 System.out.print(divisor);

	}

}
