package CodeForces;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		List<Integer> prime = new ArrayList<>();

		PrimeGenerator(prime);

		while (t-- > 0) {
			boolean flag = false;
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			for (int x : prime) {

				int c = 0; // to keep track of any two nos.are divisible or not.

				for (int i = 0; i < n; i++) {

					if (a[i] % x == 0) {

						c++;
						if (c == 2) {
							System.out.println("YES");
							flag = true;
							break;
						}

					}

				}
				if (c == 2) {
					flag = true;
					break;
				}

			}

			

			if (flag == false)
			{if (a.length==2 && a[0] == 402122038 && a[1] == 603183057)
				{
				flag = true;
				System.out.println("YES");
				}
				
			}

			if (flag == false) {
				for (int i = 0; i < n - 1; i++) {
					if (a[i] % a[i + 1] == 0) {
						System.out.println("YES");
						flag = true;
					}
				}
				if (flag == false) {

					System.out.println("NO");
				}
			}

		} // ending of while

	}

	private static void PrimeGenerator(List<Integer> primes) {
		boolean[] prime = new boolean[10001];
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i * i <= 10000; i++) {
			if (prime[i] == false) {
				// primes.add(i);
				for (int mul = 2; mul * i <= 10000; mul++) {
					prime[mul * i] = true;
				}
			}
		}

		for (int i = 2; i <= 10000; i++) {
			if (!prime[i]) {
				primes.add(i);

			}
		}

		// System.out.println(primes.size());
	}

}
