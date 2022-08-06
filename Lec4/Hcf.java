package Lec4;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int divisor = s.nextInt();
		int divident = s.nextInt();

//		int i = 2, f = 0, c = 0;
//		if (n1 < n2) {
//			c = n1;
//		} else {
//			c = n2;
//		}
//
//		while (i <= c) {
//
//			if (n1 % i == 0 && n2 % i == 0) {
//				f = i;
//				System.out.print(i + " i* \n");
//			}
//			i++;
//
//		}
//
//		System.out.println(f + " ");

	while(divident%divisor!=0) {
		int rem = divident%divisor;
		
		divident = divisor;
		divisor = rem;
	}
	System.out.println(divisor+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
	}

}
