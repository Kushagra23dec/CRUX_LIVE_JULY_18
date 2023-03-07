package RecursionRevision2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		int a = divisor, b = divident;

		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}

		int lcm = (a * b) / divisor;

		System.out.println(lcm);

	}

}
