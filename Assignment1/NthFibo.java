package Assignment1;

import java.util.Scanner;

public class NthFibo {

	public static void main(String[] args) {
		 int a = 0, b = 1;
		 Scanner s = new Scanner(System.in);
		 int  n = s.nextInt();
		 
		 for(int i = 0 ; i<n;i++) {
			  
			int c=a+b;
			 a = b;
			 b=c;
		 }
		 System.out.println(a);

	}

}
