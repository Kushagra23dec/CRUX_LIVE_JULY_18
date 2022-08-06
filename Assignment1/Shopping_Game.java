package Assignment1;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1, x = 0, a = 0, b = 0, size = n * 2;
		int[] arr = new int[size];
		int M = 0, N = 0;

		// taking the values of M and N , here M is at Odd place, and N is at Even place
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
				M = arr[in];
				in++;
				N = arr[in];
				in++;

				checker = 0;
			}

			a += i;
			i++;
			b += i;
			i++;

			if (a > M) {
				System.out.println("Harshit");
				i = 1;
				a = 0;
				b = 0;
				checker = 1;
			} else if (b > N) {
				System.out.println("Aayush");
				i = 1;
				a = 0;
				b = 0;
				checker = 1;
			}

			if (exit == 1) {
				break;
			}

		}

	}

}
