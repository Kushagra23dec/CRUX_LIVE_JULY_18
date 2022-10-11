package BackTrackingQuestions;

import java.util.Scanner;

public class NQueen {
	static int c = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] board = new boolean[n][n];

		// first row is 0, and total queens are n...
		nQueen(board, 0, n);

		System.out.println(c);

	}

	public static void nQueen(boolean[][] board, int row, int tq) {

		if (tq == 0) {
			// Display(board);
			c++;
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				nQueen(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}

	}

	public static void Display(boolean[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {

		int r = row, c = col;
		// for upper-left diagonal
		while (r >= 0 && c >= 0) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

		r = row;
		c = col;
		// for upper-right diagonal
		while (r >= 0 && c < board[0].length) {
			if (board[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}

		r = row;
		// for upper column
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}

		return true;
	}

}
