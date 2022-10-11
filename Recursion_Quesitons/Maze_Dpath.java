package Recursion_Quesitons;

import java.util.Scanner;

public class Maze_Dpath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println("\n" + mazeDPath(n, m, 0, 0, ""));

	}

	public static int mazeDPath(int n, int m, int Mro, int Mcol, String ans) {

		// WHEN BOTH NO ROW AND COLUMN IS LEFT, THEN WE PRINT THE ANSWER AND RETURN 1...
		if (Mro == n - 1 && Mcol == m - 1) {
			System.out.print(ans + " ");
			return 1;
		}

		int a = 0, b = 0, c = 0;

		if (Mro < n - 1)
			a = mazeDPath(n, m, Mro + 1, Mcol, ans + "V");

		if (Mcol < m - 1)
			b = mazeDPath(n, m, Mro, Mcol + 1, ans + "H");

		// HERE WE ARE INCREASING BOTH ROW AND COLUMN COUNT BECAUSE A DIAGONAL IS EQUAL
		// TO ROW+1 AND COLUMN+1 MOVE...
		if (Mro < n - 1 && Mcol < m - 1)
			c = mazeDPath(n, m, Mro + 1, Mcol + 1, ans + "D");

		return a + b + c;

	}

}
