package Revision1;

import java.util.Scanner;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int p = 1;
		int ans = 0;

		for (int i = n; i > 0; i /= 10) {
			int rem = i % 10;

			ans += p * (int) Math.pow(10, rem - 1);

			p++;
		}

		System.out.println(ans);

	}

}
