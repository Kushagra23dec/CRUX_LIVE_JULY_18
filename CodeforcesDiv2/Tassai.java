package CodeforcesDiv2;

import java.util.Scanner;

public class Tassai {

	static boolean flag = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			int r = sc.nextInt();
			flag = true;
			System.out.print(s - r + " ");

			generatePaths(r, s - r, n - 1, "");

			System.out.println();
		}

	}

	public static void generatePaths(int target, int range, int TotalDices, String ans) {
		if (!flag)
			return;

		if (target == 0 && TotalDices == 0) {
			flag = false;
			System.out.print(ans);
			return;
		}

		for (int i = 1; i <= range && i <= target && flag; i++) {

			generatePaths(target - i, range, TotalDices - 1, ans + i + " ");

		}

	}

}
