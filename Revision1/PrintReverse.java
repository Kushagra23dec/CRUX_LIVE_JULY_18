package Revision1;

import java.util.Scanner;

public class PrintReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.close();
		int mul = 1;
		int ans = 0;
		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;
			ans = ans * mul + rem;
			mul = 10;
		}

		System.out.println(ans);
	}

}
