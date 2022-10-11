package BackTrackingQuestions;

import java.util.Scanner;

public class NKnightProblem {

	static int c = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] board = new boolean[n][n];

		Nknight(board, 0, 0, n);
		System.out.println("\n" + c);

	}

	public static void Nknight(boolean[][] board, int row, int col, int tN) {

		if (tN == 0) {

			Display(board);
			c++;

			return;
		}

		if (col == board.length && row == board.length - 1) {
			return;
		}
		if (col == board.length) {
			Nknight(board, row + 1, 0, tN);
			return;
		}

		if (isitpossible(board, row, col)) {

			board[row][col] = true;
			Nknight(board, row, col + 1, tN - 1);
			board[row][col] = false;
		}

		Nknight(board, row, col + 1, tN);

	}

	public static boolean isitpossible(boolean[][] board, int row, int col) {

		// for upper left move
		if (row - 2 >= 0 && col - 1 >= 0) {
			if (board[row - 2][col - 1]) {
				return false;
			}
		}

		// for upper right move
		if (row - 2 >= 0 && col + 1 < board.length) {
			if (board[row - 2][col + 1]) {
				return false;
			}
		}

		return true;
	}

	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j])
					System.out.print("{" + i + "-" + j + "} ");
			}

		}

	}

}
