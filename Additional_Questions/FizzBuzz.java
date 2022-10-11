package Additional_Questions;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] ar  = new int[n];
		 
		 
		 for(int i = 0; i<n; i++) {
			 ar[i] = sc.nextInt();
		 }
		 
		 for(int i = 0; i<n; i++) {
			 if(ar[i] % 3 == 0 && ar[i] % 5 == 0) {
				 System.out.println("fizzbuzz");
			 }else if(ar[i] % 3 == 0) {
				 System.out.println("fizz");
			 }else if(ar[i] % 5 == 0) {
				 System.out.println("buzz");
			 }else {
				 System.out.println("not fizzbuzz");
			 }
		 }
		 
		 
		 

	}

}
