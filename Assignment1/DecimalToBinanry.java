package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinanry {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int bin = 1, x = n;
		int[] a = new int[50];
		int p = 0;
		while (x > 0) {
 
			bin = x % 2;
			a[p] = bin;
			p++;
		 

			x /= 2;

		}
		 
		 
		while(p>=0) {
			System.out.print(a[p]);
		    p--;	
		} 
		

	}

}
