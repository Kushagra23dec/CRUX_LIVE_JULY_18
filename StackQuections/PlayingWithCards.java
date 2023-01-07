package StackQuections;

import java.util.*;

public class PlayingWithCards {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		for (int i = 0; i < n; i++) {
			st.push(sc.nextInt());
		}

		playingWithCards(st, q);

	}

	public static void playingWithCards(Stack<Integer> st, int q) {
		List<Integer> primes = new ArrayList<>();
		findPrime(primes);
		Stack<Integer> A = new Stack<>();
		Stack<Integer> B = new Stack<>();

		for (int i = 0; i < q; i++) {
			int p = primes.get(i); // p holds the ith prime

			while (!st.isEmpty()) { // while st is not empty.

				int x = st.pop();

				if (x % p == 0) { // if x is divisible by p.
					B.push(x); // push it into B.
				} else {
					A.push(x); // else Push it into A.
				}

			}
			// Once St become Empty.
			if (st.isEmpty()) {
				// Print Elements in B.
				while (!B.isEmpty()) {
					System.out.print(B.pop() + "\n");

				}
				// then put all the elements of A into st.
				st = A;
				A = new Stack<>(); // and allocate new Memeory to A.
			}

		}

		// once q is over print st, i.e, A;
		while (!st.isEmpty()) {
			System.out.print(st.pop() + "\n");
		}

	}

	public static void findPrime(List<Integer> primes) {

		boolean[] prime = new boolean[100001];
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i * i <= 100000; i++) {
			if (prime[i] == false) {

				for (int mul = 2; mul * i <= 100000; mul++) {
					prime[mul * i] = true;
				}
			}
		}

		for (int i = 2; i <= 100000; i++) {
			if (!prime[i]) {
				primes.add(i);
			}
		}
	}

}
