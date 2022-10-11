package Revision1;

// Binary to decimal
import java.util.*;

public class FindCB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dec = 0;
		int mul = 1;
		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;

			dec += rem * mul;

			mul *= 2;
		}

		System.out.println(dec);
	}

}