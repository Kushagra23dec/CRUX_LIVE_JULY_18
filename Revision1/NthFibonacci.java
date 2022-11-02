package Revision1;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1, c = 0;
		int n = sc.nextInt();
		
		sc.close();

		for (int i = 0; i < n ; i++) {
            
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(c);

	}

}
