package Assignment1;

import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int r = 1, digit = 0;
		 for(int i = n; i>0; i/=10) {
			 
			 r = i%10;
			 digit = digit*10 + r;
		 }
		 System.out.println(digit);

	}

}
