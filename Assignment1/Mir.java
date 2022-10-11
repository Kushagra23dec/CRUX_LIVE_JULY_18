package Assignment1;

import java.util.Scanner;

public class Mir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, x = 0, a = 0, b = 0, size = n * 2;
		int[] arr = new int[size];
		int N = 0, R = 0;

		 
		while (x < arr.length) {
			arr[x] = sc.nextInt();
			x++;
		}
		int exit = 0, checker = 1, in = 0;
		while (true) {

			if (checker == 1) {
				if (in > arr.length - 1) {
					exit = 1;
					break;
				}
				N = arr[in];
				in++;
				R = arr[in];
				in++;

				checker = 0;
			}
			int p = N - R;
			int nf = 1, nrf = 1, rf = 1, Result = 1, x1 = 0;
			while (x1 < N - 1) {

				nf *= N - x1;

				if (x1 < p - 1) {
					nrf *= p - x1;

				}

				if (x1 < R - 1) {
					rf *= R - x1;
				}

				x1++;
			}

			Result = (nf / (nrf * rf));

			if (x1 > n) {
				System.out.println(Result);
				i = 1;

				checker = 1;
			}

			if (exit == 1) {
				break;
			}

		}

	}
}
