package Lec27;

import java.util.Scanner;

public class RatChazeItsCheese {

	static boolean f = false;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < n; i++) {
			String st = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = st.charAt(j);
			}
		}

		int[][] path = new int[n][m];

		RatChaze(maze, 0, 0, path);

		if (f == true) {

			System.out.println("NO PATH FOUND");
		}

	}

	public static void RatChaze(char[][] maze, int cr, int cc, int[][] ans) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			f = true;
			ans[cr][cc] = 1;
			Display(ans);
			return;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;

		int[] r = { 1, 0, -1, 0 };
		int[] c = { 0, 1, 0, -1 };
		for (int i = 0; i < r.length; i++) {
			RatChaze(maze, cr + r[i], cc + c[i], ans);
		}

//		RatChaze(maze, cr + 1, cc, ans);
//		RatChaze(maze, cr, cc + 1, ans);
//		RatChaze(maze, cr - 1, cc, ans);
//		RatChaze(maze, cr, cc - 1, ans);

		maze[cr][cc] = '0';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

}
