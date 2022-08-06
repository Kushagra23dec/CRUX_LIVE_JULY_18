package Lec5;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

	int a = 0, b=1, c= 0;
	for(int i = 0; i<n;i++) {
		 
		System.out.print(a+" ");
		
		c=a+b;
		a=b;
		b=c;
	}
	
	
	
	
	
	
	
	}

}
