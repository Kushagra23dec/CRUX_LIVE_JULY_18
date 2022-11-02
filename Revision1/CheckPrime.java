package Revision1;

import java.util.*;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}

		System.out.println("Prime");
	}

}
