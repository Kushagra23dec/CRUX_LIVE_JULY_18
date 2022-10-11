package Assignment4;

import java.util.Scanner;

public class Piyush_magic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();

		// (.) -2
		// * +5
		// # next row without loosing any energy
		// -1 for every step
		// no energy loss for last element or row to next row

		char[][] park = new char[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				park[i][j] = sc.next().charAt(0);
			}
		}

		Magical_park(park, k, s);

	}

	public static void Magical_park(char[][] park, int k, int s) {

		for (int i = 0; i < park.length; i++) {
			for (int j = 0; j < park[0].length; j++) {

				if (s < k) {
					break;
				}
				if (park[i][j] == '.') {
					s -= 2;
				} else if (park[i][j] == '*') {
					s += 5;
				} else if (park[i][j] == '#') {
					break;
				}
				if (j < park[0].length-1) {
					s--;
				}

			}

			if (s >= k) {
				System.out.println("Yes");
				System.out.println(s);
			} else {
				System.out.println("No");
			}

		}
	}

}
